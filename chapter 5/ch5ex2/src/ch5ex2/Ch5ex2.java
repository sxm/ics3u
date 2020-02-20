package ch5ex2;
import java.util.Scanner;
/**
 *
 * @author swaheed9387
 */
public class Ch5ex2 {

    
    public static void main(String[] args) {
    
    int w, l, wd, h, t;
   
     
    Scanner input = new Scanner(System.in);
    System.out.print("Enter package weight in kilograms: ");
    w = input.nextInt();
    
    System.out.print("Enter package length in centimetres: ");
    l = input.nextInt();
    
    System.out.print("Enter package width in centimetres: ");
    wd = input.nextInt();
    
    System.out.print("Enter package height in centimetres: ");
    h = input.nextInt();
    
    t = l*wd*h;
    if (w>27)  {
        
        System.out.println("Too heavy.");
        
    }
    
   if (t > 100000) {
        
        System.out.println("Too large.");
    }
    
   if (t > 100000 && w>27) {
        
        System.out.println("Too heavy and too large.");
        
    }
    

    }
    
}
