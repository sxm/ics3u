package ch4ex2;
import java.util.Scanner;

public class Ch4ex2 {

    public static void main(String[] args) {
        double cost=0;
        double d=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the diameter of the pizza in inches: ");
        d=input.nextDouble();
        input.close();
        cost = 0.75+1+(0.05*Math.pow(d, 2));
        System.out.format("The height of the object is: $%.2f", cost);


    }
    
}
