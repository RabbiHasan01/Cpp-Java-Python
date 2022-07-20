 
package stddaviation;

import java.util.Scanner;

 
public class StdDaviation {

     static double avrg(double arr[], int n)
    {
        // Compute mean (average of elements)
        double sum = 0;
         
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System .out.println(sum);
        double  avrg = (double)sum/(double)n;
        System.out.println( "Avrg: " + avrg(arr, n));
    }
    public static void main(String[] args) {
          
    Scanner input = new Scanner(System.in);
    
        int n;
        n=input.nextInt();
        double arr[]= new double[n];
        
        for(int i=0; i<n; i++){
            arr[i]=input.nextDouble();
            double avravge= avrg(arr, n);
         
        
    //System.out.println ("Standard Deviation: "
                 //   + standardDeviation(arr, n)); 
        
        
        
}
}
 
    
 
