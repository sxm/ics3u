package ch4ex6;
import java.util.Scanner;

public class Ch4ex6 {

    public static void main(String[] args) {
        int change=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the change in cents: ");
        change=input.nextInt();
        input.close();
        int quarter=change/10;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        
        System.out.format("Quarters: ", quarter);

    }
    
}
