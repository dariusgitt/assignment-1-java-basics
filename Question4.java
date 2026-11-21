
package Assignment1;
import java.util.Scanner;
public class Question4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();
        if (experience >= 5) {
            System.out.println("\nEligible for promotion");
        } else {
            System.out.println("\nNot eligible for promotion");
        }
    }
}