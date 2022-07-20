 
package gradeinjava;

import java.util.Scanner;

 
public class GradeInJava {

   
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        int num1 ,num2,num3 , sum,avrg ;
         
       System .out .println("ENTER 3 NUMBERS:");
       num1= input .nextInt();
       num2= input .nextInt();
       num3= input .nextInt();
      
        
        sum=num1+num2+num3;
         System .out .println("SUM= "+sum);
        
        avrg =sum/3;
        System .out .println("AVRG ="+avrg);
        
        if (avrg >= 83 && avrg <=100 )
            System .out .println("THE GRADE IS A+");
        
         else if ( avrg >= 78 && avrg <83)
            System .out .println("THE GRADE IS A");
         
         else if (avrg >= 73 && avrg <78)
            System .out .println("THE GRADE IS A-");
          
          else  if (avrg >= 68 && avrg <73)
            System .out .println("THE GRADE IS B+"); 
           
         else   if ( avrg >= 63 && avrg <68)
            System .out .println("THE GRADE IS B");
           
           else  if (  avrg >= 58 &avrg <63)
            System .out .println("THE GRADE IS B-");
            
            else  if ( avrg >= 53 && avrg <58)
            System .out .println("THE GRADE IS C");
             
              else if (avrg >=48 && avrg <53 )
            System .out .println("THE GRADE IS D");
              
              else
            System .out .println("THE GRADE IS FAIL");
        
    }
   
    
}
