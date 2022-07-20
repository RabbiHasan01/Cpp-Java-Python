
package practice_problem;

import java.util.Scanner;

public class program_2 {
    public static void repeat(String st,int length){
        if(length>=3)
        {
            if(length%3==0)
            {
                for(int i=1;i<length;i=i+3)  {
              for(int j=i;j<=(i+1);j++)
              {
                  System.out.print(st.charAt(j));
              }
              System.out.print(st.charAt(i-1));
          }
            }
          else
            {
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println(" ");
        }
        
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
        System.out.println("Enter a string : ");
        String st=input.next();
        int length=st.length();
        repeat(st,length);
    }
}
