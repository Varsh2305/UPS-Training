package file_handling;

import java.util.*;
import java.io.*;

public class Supermarket {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int product, quantity, category;
        String name = " ";
        int total = 0, price = 0;
        char choice;

        FileWriter fw = new FileWriter("C:\\Users\\varsh\\Downloads\\bill.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        do {
            System.out.println("Supermarket");
            System.out.println("1. Fruits");
            System.out.println("2. Vegetables");
            System.out.println("Select Category");
            category = sc.nextInt();

            switch (category) {
                case 1:
                    System.out.println("1. Apple - Rs.60/kg");
                    System.out.println("2. Mango - Rs.100/kg");
                    System.out.println("3. Orange - Rs.80/kg");
                    System.out.println("Select Product");
                    product = sc.nextInt();

                    switch (product) {
                        case 1:
                            name = "Apple";
                            price = 60;
                            break;
                        case 2:
                            name = "Mango";
                            price = 100;
                            break;
                        case 3:
                            name = "Orange";
                            price = 80;
                            break;
                        default:
                            System.out.println("Invalid Product");
                            name = " ";
                    }
                    break;

                case 2:
                    System.out.println("1. Tomato - Rs.40/kg");
                    System.out.println("2. Onion - Rs.50/kg");
                    System.out.println("3. Carrot - Rs.70/kg");
                    System.out.println("Select Product");
                    product = sc.nextInt();

                    switch (product) {
                        case 1:
                            name = "Tomato";
                            price = 40;
                            break;
                        case 2:
                            name = "Onion";
                            price = 50;
                            break;
                        case 3:
                            name = "Carrot";
                            price = 70;
                            break;
                        default:
                            System.out.println("Invalid Product");
                            name = " ";
                    }
                    break;

                default:
                    System.out.println("Invalid Category");
                    name = " ";
            }

            if (!name.equals(" ")) {
                System.out.println("Enter the quantity:");
                quantity = sc.nextInt();

                int amount = price * quantity;
                total = total + amount;

                bw.write("Product: " + name);
                bw.newLine();
                bw.write("Price: Rs." + price + "/kg");
                bw.newLine();
                bw.write("Quantity: " + quantity + " kg");
                bw.newLine();
                bw.write("Amount: Rs." + amount);
                bw.newLine();
                bw.write("------------------------");
                bw.newLine();
            }

            System.out.println("Do you want to add any other products? y/n:");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        bw.write("Total Amount: Rs." + total);
        bw.newLine();

        bw.close();

        System.out.println("Total Amount: Rs." + total);
        System.out.println("Bill saved successfully in bill.txt");

        sc.close();
    }
}
