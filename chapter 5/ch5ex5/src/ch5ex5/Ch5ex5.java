package ch5ex5;
import java.util.Scanner;
/**
 *
 * @author swaheed9387
 */
public class Ch5ex5 {

   
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        grade = input.nextInt();
        input.close();
        
        System.out.printf("The corresponding letter grade is: ");
        if (grade < 60){
            System.out.print("F"); 
        }

        if (grade > 60 && grade <= 69){
            System.out.printf("D"); 
        }
        
        if (grade >= 70 && grade <= 79){
            System.out.printf("C"); 
        }
        
        if (grade >= 80 && grade <= 89){
            System.out.printf("B"); 
        }
        
        
        if (grade >= 90 && grade <= 100){
            System.out.printf("A"); 
        }
        
    }
    
}
