
package practice_problem;

import java.util.Scanner;


public class program_6 {
    public static void sum(int []array,int n){
        int s=0;
        for(int i=0;i<n;i++){
            s=s+array[i];
        }
        System.out.print(s);
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the array size : ");
        int n=input.nextInt();
        int []array=new int [n];
        System.out.print("Enter an array : ");
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        sum(array,n);
    }
}
