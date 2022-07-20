 
package tutorialdemo;

import java.util.Scanner;

 
public class ConditionalOperator {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.print( "Enter two numbers : ");
        num1= input.nextInt();
        num2= input.nextInt();
        
        int large=(num1>num2) ? num1: num2;
        
        System.out.println("The large number is "+large);
                
        
    }
    
}
