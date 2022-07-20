 
package mylabwork;

import java.util.Scanner;

 
public class MyLabWork003 {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter string");
        
        String str;
        String newstr;
        str=in.nextLine();
        int len=str.length();
        System.out.println("Enter num between 0 to "+len);
        int n=in.nextInt();
        
        for(int i=0;i>n;i--){
            
        if(len>n)
        {
            newstr=str.substring(2,n );
             System.out.print(newstr);
        }
        else
        {
            newstr=str;
             System.out.print(newstr);
        }
        }
      
    }
    
}
