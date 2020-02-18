package ch5ex3;
import java.util.Scanner;

/**
 *
 * @author swaheed9387
 */
public class Ch5ex3 {
 //0 up to but not including 4 dozen $0.50 per dozen
// 4 up to but not including 6 dozen $0.45 per dozen
// 6 up to but not including 11 dozen $0.40 per dozen
// 11 or more dozen $0.35 per dozen
// Extra eggs are priced at 1/12 the per dozen price.
 
    public static void main(String[] args) {
        
        double eggs = 0;
        double dozen = 0;
        double price;
        double lftover;
        double fn;
       
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of eggs purchased: ");
        eggs = input.nextDouble();
        input.close();
        dozen = eggs/12;
        lftover = dozen % 1;
        
        if (dozen >= 0 && dozen < 4){
        price = 0.5;
        fn = (price*dozen) + (lftover*(price/12));
        System.out.format("The bill is equal to: $%.2f", fn);
        
        }
        
        if (dozen >= 4 && dozen < 6){
        price = 0.45;
        fn = (price*dozen) + (lftover*(price/12));
         System.out.format("The bill is equal to: $%.2f",fn);
        }
          
        if (dozen >= 6 && dozen < 4){
        price = 0.40;
        fn = (price*dozen) + (lftover*(price/12));
         System.out.format("The bill is equal to: $%.2f", fn);
        }
            
        if (dozen > 11){
        price = 0.40;
        fn = (price*dozen) + (lftover*(price/12));
         System.out.format("The bill is equal to: $%.2f", fn);
        }
    }
    

}
    



    
