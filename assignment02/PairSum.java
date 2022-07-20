 
package assignment02;

import java.util.Scanner;

 
public class PairSum {
    public static void sumpair(int [] arr,int len)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Choose input for sum : ");
       int sum= in.nextInt();
       
       for(int i=0;i<len;i++){
           for(int j=i+1;j<len;j++){
               if(arr[i]+arr[j]==sum){
                   System.out.println(arr[i]+"+"+arr[j]+ "=" +sum);
                     
                 }
          
           }
           
       }
        
        
    }
    
}
