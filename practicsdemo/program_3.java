
package practice_problem;

import java.util.Scanner;

public class program_3 {
    public static void contains(String st,String st2,int length,int length2){
       int c=0;
       String l="";
        char r = st2.charAt(0);
      for(int i=0;i<(length-length2+1);i++)
      {
          if(st.charAt(i)==r)
          {
             for(int j=i;j<(i+length2);j++)
             {
                l+=st.charAt(j);
             }
             if(l.contains(st2))
             {
                 c++;
             }
          }
          
      }
   
      if(c!=0)  
       {
           System.out.print(st+" Contains "+st2+" "+c+" time ");
       }
      else
      {
           System.out.print(st+" doesn’t contain "+st2);
      }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String st=input.next();
        System.out.println("Enter a substring : ");
        String st2=input.next();
        int length1=st.length();
        int length2=st2.length();
        contains(st,st2,length1,length2);
         
   
    }
     
}
