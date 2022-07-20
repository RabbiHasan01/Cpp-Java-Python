 
package labdemo;

import java.util.Scanner;

 
public class PracticsProblem003 {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        String s,subs;
        System.out.println("Enter string ::");
        s=in.nextLine();
        System.out.println("Enter substring :: ");
        subs=in.nextLine();
        int len1=s.length();
        int len2=subs.length();
        char c1[]=s.toCharArray();
        char c2[]=subs.toCharArray();
        int count=0;
        //System.out.println(c1[0]);
        for(int i=0;i<len1;i++)
        { System.out.println(s.charAt(i));
            
          if(c2[0]==c1[i]){
              System.out.print(c2);
          }
            //for(int j=i;j<len2;j++){
            //   count ++;
               
              
            //{
               // System.out.print(ch);
           // }
        }
        
    }
    
}
