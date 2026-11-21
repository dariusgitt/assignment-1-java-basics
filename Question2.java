package Assignment1;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read details
        // IMPROVED: long instead of int - bank account numbers can be bigger than int can hold
        System.out.print("Enter Bank Account Number: ");
        long accNum = sc.nextLong();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();
        System.out.print("Enter Account Balance: K");
        double balance = sc.nextDouble();
        // Display details
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: K" + balance);
        sc.close();
    }
}
