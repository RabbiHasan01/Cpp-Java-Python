 
package practicsdemo;

import java.util.Scanner;

 
public class PrcticsProblem007 {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int n,i,max;
        System.out.print("Enter the number of element :: ");
        n=in.nextInt();
        int a[]=new int [n];
        max=a[0];
        System.out.println("Insert elements :: ");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        
            if(a[i] >=max)
            {
              for(i=0;i<n;i++)
            {
              max=a[i];
              System.out.print("list :: "+a[i]);
                System.out.println( " ");
            }
            }
        
       else
        {
            System.out.print("Sort :: "+max);
            System.out.println(" ");
        }
       }
                
    }
    
}
