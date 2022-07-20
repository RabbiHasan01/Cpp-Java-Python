  
package SummationJava;

import java.util.Scanner;

 
public class  SummationJava { 
    
    public static void main(String[] args)
    {
        int num;
        double num2,result;
        
        Scanner input= new Scanner (System.in)  ;
        
        num= input.nextInt();
        
        num2= input.nextDouble();
        
        result =num+num2;
        
        System.out.print( "SUM IS = "+ result);
              
                
    }
     
            
    
}

