package Assignment1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Salesperson name: ");
        String name = s.nextLine();

        System.out.print("How many months do you make sales? ");
        int px;
        // FIXED: validate input - was crashing on negative months (NegativeArraySizeException)
        // and giving Infinity on 0 months (total / 0)
        try {
            px = s.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a whole number for months.");
            s.close();
            return;
        }
        if (px <= 0) {
            System.out.println("Please enter a positive number of months.");
            s.close();
            return;
        }

        double[] sales = new double[px]; // array creation
        double total = 0;
        for (int i = 0; i < px; i++) {
            System.out.print("Enter sales for month " + (i + 1) + ": K");
            sales[i] = s.nextDouble();
        }
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        double average = total / sales.length;
        // Display results
        System.out.println("\n---Salesperson info--- ");
        System.out.println("Salesperson: " + name);
        System.out.println("Total Sales: K" + total);
        System.out.println("Average Sales: K" + average);
        s.close();
    }
}
