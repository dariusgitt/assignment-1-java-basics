package Assignment1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in); 
        int px;
        px = 0;
        System.out.print("Enter Salesperson name: ");
        String  name=s.nextLine();
        System.out.print("How many months do you make sales? ");
        px=s.nextInt();
        double [] sales=new double[px]; //array creation
        double total=0;
        for(int i=0;i<px;i++){
            System.out.print("Enter sales for month " +(i+1)+ ": K");
            sales[i]=s.nextDouble();
        }        
        for(int i=0;i<sales.length;i++){
            total +=sales[i];
        }
        double average = total / sales.length;       
                // Display results
        System.out.println("\n---Salesperson info--- ");
        System.out.println("Salesperson: " + name);
        System.out.println("Total Sales: K" + total);
        System.out.println("Average Sales: K" + average);
    }
}