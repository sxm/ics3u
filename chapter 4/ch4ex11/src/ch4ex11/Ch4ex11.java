package ch4ex11;
import java.util.Scanner;

public class Ch4ex11 {

    public static void main(String[] args) {
        double ch, tbt, pay, b, f, s, t, fn, tax;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of burgers: ");
        b=input.nextDouble();
        System.out.print("Enter the number of fries: ");
        f=input.nextDouble();
        System.out.print("Enter the number of sodas: ");
        s=input.nextDouble();
        System.out.print("Enter amount tendered: $");
        pay=input.nextDouble();  
            
        input.close();   
    
        tbt = (b*1.69+f*1.09+s*0.99);
        tax = (tbt*0.13);
        fn = (tbt + tax);
        ch = (pay-fn);
        System.out.format("\n Total before tax: %.2f", tbt);
        System.out.format("\n Tax: %.2f", tax);
        System.out.format("\n Final total: %.2f", fn);
        System.out.format("\n Change: %.2f", ch);
        
        
       
        
        
        
        
  


    
}
    

}