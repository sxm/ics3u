package ch4ex1;
import java.util.Scanner;

public class Ch4ex1 {

    public static void main(String[] args) {
        double height=0;
        double total=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a time less than 4.5 seconds: ");
        height=input.nextDouble();
        input.close();
        total=100-4.9*Math.pow(height, 2);
        System.out.format("The height of the object is: %.1f", total);


    }
    
}
