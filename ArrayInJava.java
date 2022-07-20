 
package arrayinjava;

import java.util.Scanner;

 
public class ArrayInJava {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int length;
        length=input.nextInt();
        
         String [] number= new   String[length];
         
         for ( int i=0;i<length;i++)
             
             number[i]= input.next();
         System.out.println(number[i]);
        
    }
    
}
