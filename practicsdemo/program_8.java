
package practice_problem;

import java.util.Scanner;


public class program_8 {
    public static void follow(int []array,int n,int k){
        int c=0;
        for(int i=0;i<n-1;i++)
        {
         
         if((array[i]==k)||(array[i+1]==k))
         {
            c++;
         }
        
        }
       
       if(c!=(n-1))
        {
            System.out.print("false");
        }
        else
        {
            System.out.print("true");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the array size : ");
        int n=input.nextInt();
        int []array=new int[n];
        System.out.print("Enter an array : ");
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        System.out.print("Enter Integer : ");
        int k=input.nextInt();
        follow(array,n,k) ;
    }
}
