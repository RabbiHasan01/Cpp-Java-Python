 
package assignment02;

 
public class DuplicateNum {
 public static void deleteDuplicate(int newarr[], int x) 
    { 
 
        int[] tem = new int[x]; 
          
       
        int j = 0; 
        for (int i=0; i<x-1; i++) 
            
            if (newarr[i] != newarr[i+1]) 
                tem[j++] = newarr[i]; 
          
        
        tem[j++] = newarr[x-1];    
          
         System.out.println("The new array is avoid duplicate elements :");
        for (int i=0; i<j; i++) {
            newarr[i] = tem[i]; 
       
         System.out.print(newarr[i]+" ");
    }
        System.out.println("\n");
    }
    
}
