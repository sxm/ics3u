package ch4ex12;
import java.util.Scanner;

public class Ch4ex12 {


    public static void main(String[] args) {
    double d, c, db, t, all;   
    System.out.println("Enter the number of minutes spent on each of the following project tasks: ");
    Scanner input = new Scanner(System.in);
    System.out.print("Designing: ");
    d = input.nextDouble();
    System.out.print("Coding: ");
    c = input.nextDouble();
    System.out.print("Debugging: ");
    db = input.nextDouble();
    System.out.print("Testing: ");
    t = input.nextDouble();
   
    
    input.close();
    all = d + c + db + t;
    
    System.out.format("\n Task \t \t \t Time");
    System.out.format("\n Designing  \t \t %.2f%%", ((d/all)*100));
    System.out.format("\n Coding  \t \t %.2f%%", ((c/all)*100));
    System.out.format("\n Debugging  \t \t %.2f%%", ((db/all)*100));
    System.out.format("\n Testing  \t \t %.2f%%" , ((t/all)*100));

        
        
        


    }
    
}
