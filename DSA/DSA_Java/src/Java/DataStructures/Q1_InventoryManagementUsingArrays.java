package Java.DataStructures;


import java.util.Scanner;

public class Q1_InventoryManagementUsingArrays {
    static class Product{
        int id;
        String name;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price){
            this.id = productId;
            this.name = productName;
            this.quantity = quantity;
            this.price = price;
        }

        void displayProductFields(){
            System.out.println("Product id :- " + id);
            System.out.println("Product name :- " + name);
            System.out.println("Product quantity :- " + quantity);
            System.out.println("Product price :- " + price);
        }
    }

    static class Inventory{
        int size;
        static Product[] products;
        static int count = 0;

        Inventory(int inventorySize){
            size = inventorySize;
            products = new Product[inventorySize];
        }

        static void insertProducts(int productId, String productName, int quantity, double price){
            if(count == products.length){
                System.out.println("Inventory is full");
                return;
            }

            products[count] = new Product(productId, productName, quantity, price);
            count++;

            System.out.println("Product is successfully inserted");
        }

        static void displayProducts(){
            for(int i = 1; i <= count; i++) {
                System.out.println("Product" + i );
                products[i-1].displayProductFields();
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inventory size: ");
        int size = sc.nextInt();

        Inventory inventory = new Inventory(size);

        inventory.insertProducts(101, "Boxing gloves", 2, 1330.5);
        inventory.insertProducts(102, "Shin Pad", 2, 1530.5);
        inventory.insertProducts(103, "MMA Gloves", 2, 1000.5);
        inventory.insertProducts(104, "Mouth Piece", 1, 330.5);
        inventory.insertProducts(105, "Protein Shake", 1, 5000.0);
        inventory.displayProducts();

    }
}
