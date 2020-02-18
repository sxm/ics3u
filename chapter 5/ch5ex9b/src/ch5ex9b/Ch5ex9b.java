package ch5ex9b;
import java.util.Random;
import java.util.Scanner;

public class Ch5ex9b {

    public static void main(String[] args) {
     Random r = new Random();      
     int num1 = r.nextInt(20)+1;
     int ans;

     
     System.out.print("Enter a number between 1 and 20: ");
     Scanner input = new Scanner(System.in);
     ans = input.nextInt();
     input.close();
        System.out.println("Computer's number: " + num1);
        System.out.println("Player's number: " + ans);

        if (num1==ans){
            
            System.out.println("You won!");
            
        }
        
        else {
            
            System.out.println("Better luck next time.");
        }
    }
    
}
