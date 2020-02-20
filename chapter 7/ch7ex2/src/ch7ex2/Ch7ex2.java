
package ch7ex2;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author swaheed9387
 */
public class Ch7ex2 {

    public static void main(String[] args) {
    
        double num,choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextDouble();
       
        System.out.println("Convert:");
        System.out.println("1. Inches to Centimeters \t \t \t" + "5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters \t \t \t" + "6. Centimeters to Feet");
        System.out.println("3. Yards to Meters \t \t \t" + "7. Meters to Yards");
        System.out.println("4. Miles to Kilometers \t \t \t" + "8. Kilometers to Miles");
        
        System.out.println("Enter your choice: ");
        choice = input.nextDouble();
        input.close();
        
        if (choice==1){inchcent(num);}
        if (choice==2){feetcent(num);}
        if (choice==3){yardmeter(num);}
        if (choice==4){mileskilo(num);}
        if (choice==5){centinch(num);}
        if (choice==6){centfeet(num);}
        if (choice==7){meteryard(num);}
        if (choice==8){kilomile(num);}
        
        
        
    }
    
    
    public static double inchcent(double num){num*=2.54;return num;}
    public static double feetcent(double num){num*=30;return num;}
    public static double yardmeter(double num){num*=0.91;return num;}
    public static double mileskilo(double num){num*=1.6;return num;}
    public static void centinch(double num){System.out.println(num + " centimeters equals " + (num/=2.54) + " inches.");}
    public static void centfeet(double num){System.out.println(num + " centimeters equals " + (num/=30) + " feet.");}
    public static void meteryard(double num){System.out.println(num + " meters equals " + (num/=.91) + " yards.");;}
    public static void kilomile(double num){System.out.println(num + " kilometers equals " + (num/=1.6) + " miles.");}
    
    
    

}
