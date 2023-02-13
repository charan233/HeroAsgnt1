import java.util.Scanner;

class Base {
    private String name;
    private String specification;
    private int cost;
    private int count;

    public Product(String name, String specification, int cost, int count) {
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }



    public void setSpecification(String specification) {
        this.specification = specification;
    }



    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class Inventory {
    private Base[] products;
    private int count;
    public Inventory() {
        products = new Base[10];
        count = 0;
    }

    public void addBase(Base Base) {
        products[count++] = Base;
    }



    public void viewBaseList() {
        System.out.println("Base List:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + products[i].getName());
        }
    }



    public void viewBaseCount(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println("Count: " + products[i].getCount());
                return;
            }
        }


        System.out.println("Product not found.");
    }



    public void viewBaseDetails(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equals(name))
             {

                System.out.println("Base Details:");

                System.out.println("Name: " + products[i].getName());

                System.out.println("Specification: " + products[i].getSpecification());

                System.out.println("Cost: " + products[i].getCost());

                System.out.println("Count: " + products[i].getCount());
                return;
            }
        }
        System.out.println("Base not found.");
    }

    public void editBase(String name, String specification, int cost, int count) {
        for (int i = 0; i < this.count; i++)
         {
            if (products[i].getName().equals(name))
             {
                products[i].setSpecification(specification);
                products[i].setCost(cost);
                products[i].setCount(count);
                System.out.println("Base details updated successfully.");
                return;
            }
          }
        }
      }

