 
package shomework;

import java.util.Scanner;

 
public class ArrayJava {
   
   
  public  static  avrg(double arr[], int n)
    {
        // Compute mean (average of elements)
        double sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
        double mean = (double)sum/(double)n;
     
    public static void main( String[] args){
    
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        double arr[]= new double[n];
        for(int i=0;i>n;i++)
            arr[i]=input.nextDouble();
        System.out.println( "Avrg: " +  avrg(arr, n));
    //System.out.println ("Standard Deviation: "
                 //   + standardDeviation(arr, n)); 
        
        
        
}
}