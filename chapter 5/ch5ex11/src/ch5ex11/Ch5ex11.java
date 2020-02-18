package ch5ex11;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author swaheed9387
 */
public class Ch5ex11 {

    
    public static void main(String[] args) {
        
        double  a, b, c, root1, root2, eq;
         System.out.print("Enter value for a: ");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
         System.out.print("Enter value for b: ");
        b = input.nextDouble();
         System.out.print("Enter value for c: ");
        c = input.nextDouble();
        input.close();
        root1 = ((-b)+(Math.sqrt(Math.pow(b,2))-4*a*c))/(2*a);
        root2 = ((-b)-(Math.sqrt(Math.pow(b,2))-4*a*c))/(2*a);
        
        System.out.format("The roots are %.2f and %.2f.", root1, root2);
        
        
        
    }
    
}
