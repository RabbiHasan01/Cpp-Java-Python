
package practicsDemo;

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       int s=0;
       String temp;
        System.out.print("Enter the size : ");
        int n=input.nextInt();
        System.out.print("Enter a words : ");
        String []str=new String[n];  
        for(int i=0;i<n;i++)
        {
            str[i]=input.next();
        }
        for(int i=0;i<n;i++)
        {
       for(int j=i+1;j<n;j++)
       {
           
           if((str[i].compareToIgnoreCase(str[j]))>0)
                   {
                       temp=str[i];
                       str[i]=str[j];
                       str[j]=temp;
                   }
       }    
          
        }
        System.out.print("sort :: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]+" ");
        }
}}
