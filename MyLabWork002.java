 
package mylabwork;

import java.util.Scanner;

 
public class MyLabWork002 {
     public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i,j;
        System.out.println(" Array :1 :: Enter element");
        int n=in.nextInt();
        
        int [] num1=new int[n];
        
         System.out.println("Items");
        for(i=0;i<num1.length;i++)
        {
            num1[i]=in.nextInt();
        }
        System.out.println("Array :2 :: Enter element");
        int m= in.nextInt();
        int []num2=new int[m];
         System.out.println("Items");
        for(j=0;j<num2.length;j++)
        {
            num2[j]=in.nextInt();
        }
        
        int a=((n-1)/2);
        int b=((m-1)/2);
        
         System.out.print("The new list is : ");
         System.out.print(num1[a]+",");
          System.out.println(num2[b]);
                          
    
}
}
