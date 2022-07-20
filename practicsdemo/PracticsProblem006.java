 
package practicsdemo;

import java.util.Scanner;

 
public class PracticsProblem006 {
    public static void main(String[] args) {
        
        Scanner in =new Scanner (System.in);
        
        int n,sum=0;
        System.out.print("Enter counter :: ");
        n=in.nextInt();
      int  a[]=new int[n];
       
        System.out.println("Enter numbers:: ");
      for(int i=0;i<n;i++)
      {
          a[i]=in.nextInt();
          sum=sum+a[i];
          
      }
        System.out.print("Sum is :: "+sum);
        System.out.println("");
        
      
        
    }
            
    
}
