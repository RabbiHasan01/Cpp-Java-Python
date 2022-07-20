 
package assignment02;
 
public class insertArray {
    public static int[] insert(int []arr,int item,int pos)
    {
        int []result=new int[arr.length+1];
        
        for (int i=0;i<pos;i++){
            result[i]=arr[i];
        }
        result[pos]=item;
        
        for(int i=pos+1;i<=arr.length;i++){
            result[i]=arr[i-1];
        }
        return result;
    }

}

 

