package ch4ex8;
import java.util.Scanner;

public class Ch4ex8 {

    public static void main(String[] args) {
        int n=0, n2=0, a1=0, a2=0, a3=0, a4=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        n=input.nextInt();
        System.out.print("Enter a second integer: ");
        n2=input.nextInt();
        input.close();    
        a1 = n/n2;
        a2 = n%n2;
        a3 = n2/n;
        a4 = n2%n;
        System.out.println(n + " / " + n2 + " = " + a1);
        System.out.println(n + " % " + n2 + " = " + a2);
        System.out.println(n2 + " / " + n + " = " + a3);
        System.out.println(n2 + " % " + n + " = " + a4);

    
}
    

}