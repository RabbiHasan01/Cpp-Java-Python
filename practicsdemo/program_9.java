
package practice_problem;

import java.util.Scanner;


public class program_9 {
    public static void follow(int []array,int n,int k){
        int temp,p;
        int []a=new int [n];
          a[0]=array[0];
        for(int i=1;i<n-1;i++)
        {
            if(array[i]==k)
            {
               if((array[i-1]!=k) && (array[i+1]!=k))  
               {
                  if(array[i-1]>array[i+1])
                  {
                      a[i]=array[i-1];
                  }
                  else
                  {
                      a[i]=array[i+1];
                  }
               }
               else
               {
                  a[i]=array[i];  
               }
              
            }
            else
            {
                a[i]=array[i];
            }
        }
        a[n-1]=array[n-1];
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
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
        follow(array,n,k);
    }
}
