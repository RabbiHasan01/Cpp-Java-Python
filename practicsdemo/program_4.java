

package practice_problem;

import java.util.Scanner;


public class program_4 {
    public static void follow(String st,int n,int length){
      String s=""; 
        for(int i=0;i<n;i++)
        {
           s+=st.charAt(i);
        }
        String r="";
        for(int i=n;i<length;i++)
        {
            r+=st.charAt(i);
        }
        if(r.contains(s))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
        System.out.print("Enter a string : ");
        String st=input.next();
        System.out.print("Enter an Integer : ");
        int n=input.nextInt();
        int length=st.length();
        follow(st,n,length);
    }
}
