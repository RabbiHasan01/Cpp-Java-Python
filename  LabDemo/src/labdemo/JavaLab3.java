 
package labdemo;

import java.util.Scanner;

 
public class JavaLab3 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int i;
        String str;
        
        System.out.println("Enter any string");
        str= input.nextLine();
      char  arraystr[] =str.toCharArray();
      
      System.out.println("Converted string is : ") ;
      for (i=0;i<arraystr.length;i++)
      {
          if(arraystr[i]>='A'&& arraystr[i]<='Z')
          {
              arraystr[i]=(char)((int) arraystr[i]+32);
             // System.out.println("Convert string is : ") ;
              System .out.print(arraystr[i]);
              
          }
          
         else if (arraystr[i]>='a' && arraystr[i]<='z')
          {
              arraystr[i]=(char)((int)arraystr[i]-32);
               
              System .out.print(arraystr[i]);
          }
          
      }
        
      }
        
   }
    

