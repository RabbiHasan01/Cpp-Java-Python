
package practice_problem;

import java.util.Scanner;


public class program_7 {
    public static void  larger(int []array,int n){
        int max=array[0];
        for(int i=1;i<n;i++){
            if(array[i]>max)
            {
                max=array[i];
            }      
           }
        int []a=new int[n];
        if((max==array[0])||(max==array[n-1]))
        {
            for(int i=0;i<n;i++)
            {
                a[i]=max;
                System.out.print(a[i]+" ");
            }
             
            
        }
        else
        {
            System.out.print("Larger value is : "+max);
        }
        
        System.out.println(" ");
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
        larger(array,n);
    }
}
