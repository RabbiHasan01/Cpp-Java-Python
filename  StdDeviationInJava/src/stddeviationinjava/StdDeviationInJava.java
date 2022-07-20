 
package stddeviationinjava;

 
public class StdDeviationInJava {

     
    public static void main(String[] args) {
        double num_array[]= {1,2,3,4,5,6,7,8,9,10};
        
      // double std_daviarion= calculatedav(num_array);
        
        double sum=0.0, standerdDeviation = 0.0;
        int length = num_array.length;
        
         for(double num: num_array){
        
            sum +=num ;
        }       
        
        double mean= sum/length;
        //System.out.print
       System.out. println(mean );
       
      for( double num:num_array){
          
          standerdDeviation + = Math.pow(num-mean, 2 );
      }
        return Math.sqrt(standardDeviation/length);
    }
        
   
    
}
