package ch4ex7;
import java.util.Scanner;

public class Ch4ex7 {

    public static void main(String[] args) {
        int num=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number: ");
        num=input.nextInt();
        input.close();    
        int h = num/100;
        int t = num/10 % 10; 
        int o = num%10;   
        System.out.println("The hundreds-place digit is : "+ h);
        System.out.println("The tens-place digit is : " + t);
        System.out.println("The ones-place digit is : " + o); 
    }
    
}
