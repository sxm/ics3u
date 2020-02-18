package ch5ex16;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author swaheed9387
 */
public class Ch5ex16 {
  
    public static void main(String[] args) {
        double angle;
        System.out.print("Enter an angle in degrees: ");
        Scanner input = new Scanner(System.in);
        angle = input.nextDouble();
        input.close();
        System.out.format("Sine: %.2f \n" , Math.sin(angle));
        System.out.format("Cosine: %.2f \n" , Math.cos(angle));
        System.out.format("Tangent: %.2f \n" , Math.tan(angle));

    }
    
}
