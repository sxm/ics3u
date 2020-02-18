package ch5ex13;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author swaheed9387
 */
public class Ch5ex13 {
  
    public static void main(String[] args) {
     double o1,o2,p,r,m,f;
    Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
    p = input.nextDouble();
        System.out.print("Interest Rate: ");
    r = input.nextDouble();
        System.out.print("Number of monthly payments: ");
    m = input.nextDouble();
    input.close();
    o1 = p*(r/12);
    o2 = 1-Math.pow(1+r/12, -m);
    f = o1/o2;
 
    
    
    System.out.format("The monthly payment is $%.2f", f);


    }
    
}
