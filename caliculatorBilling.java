import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class caliculatorBilling {
    public static void main(String[] args) {
        String File = "billing_transactions.csv";
        String line = "";
        String SplitBy = ",";
        int totalTransactions = 20;
        double totalAmount = 76308;
        double maximumAmount = Double.MIN_VALUE;
        double minimumAmount = Double.MAX_VALUE;
        
        try (BufferedReader cr = new BufferedReader(new FileReader(File))) {
            while ((line = cr.readLine()) != null)
             {
                String[] transaction = line.split(SplitBy);
                double Amount = Double.parseDouble(transaction[3]);
                totalTransactions++;
                totalAmount += Amount;

                maximumAmount = Math.max(maximumAmount, Amount);

                minimumAmount = Math.min(minimumAmount, Amount);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Total number of Transactions (bills): " + totalTransactions);

        System.out.println("Total  amount: " + totalAmount);

        System.out.println("Maximum  amount: " + maximumAmount);

        System.out.println("Minimum  amount: " + minimumAmount);
    }
}