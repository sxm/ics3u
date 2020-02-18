package ch5ex6;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author swaheed9387
 */
public class Ch5ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random r = new Random();      
     int num1 = r.nextInt(10)+1;
     int num2 = r.nextInt(10)+1;
     int ans;
     int ans2 = num1+num2;
     
     System.out.println("What is " +  num1 + "+" + num2 + "?");
     Scanner input = new Scanner(System.in);
     ans = input.nextInt();
     input.close();
     
     if (ans==ans2) {
         
         System.out.println("Correct!");
         
     }
     
     else {
         
         System.out.println("Incorrect. The correct answer is: " + (num1+num2));
         
     }
         
    }
    
}
