 
package meanandstddaviation;

 
public class StanderDaviation {
 
    public static void main(String[] args) {
        
        double[]  Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double result=0;
   
        double sum = 0, std_Deviation = 0;
        int length =  Array.length;
        
        for(double num : Array) {
            sum += num;
         }
        double mean = sum/length;
        System.out. format("The  average value is = %.3f\n ",mean);
    
        for(double num:  Array) {
            std_Deviation += Math.pow(num - mean, 2);
        }
       result = Math.sqrt(std_Deviation/length);
      System.out.format("Standard Deviation is =  %.3f\n", result );
    }
 }
    
 
