
package Assignment1;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {   
        //variable declaration
        double sales;
        double commission;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--To CALCULATE 2% Commission--");
        System.out.print("Enter total sales amount: K");
        sales = sc.nextDouble();
        commission = (2.0 / 100) * sales;
        System.out.println("Commission earned: K" + commission);
    }
}