
package practicsdemo;

import java.util.Scanner;


public class program_1 {
    public static void repeat(String st,int n,int length){
        int i,j;
        if(n>length)
        {
            System.out.print("Integer exceeded string length");
        }
        else
        {
            for(i=(length-n);i<length;i++){
                for(j=(length-n);j<length;j++)
                {
                    System.out.print(st.charAt(j));
                }
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter a string : ");
        String st=input.next();
        System.out.println("Enter an integer (between 0 and the length of the string):");
        int n=input.nextInt();
        int length=st.length();
        repeat(st,n,length);
        
    }
}
