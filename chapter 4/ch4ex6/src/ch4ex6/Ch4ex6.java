package ch4ex6;
import java.util.Scanner;

public class Ch4ex6 {

    public static void main(String[] args) {
        int change=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the change in cents: ");
        change=input.nextInt();
        input.close();    
        System.out.println("The mininum amount of coins is: ");
        int q = change/25;
        int d = change%25 / 10;
        int n = change%10 / 5;     
        int p = change%5 / 1;
        System.out.println("Quarters: " + q);
        System.out.println("Dimes: " + d); 
        System.out.println("Nickels: " + n); 
        System.out.println("Pennies: " + p);
        
    }
    
}
