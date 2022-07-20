 //problem 001

package mylabwork;
 
import java.util.Scanner;

public class MyLabWork {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i,j;
        System.out.println(" Array :1 :: Enter element");
        int n=in.nextInt();
        
        int [] num1=new int[n];
        
        System.out.println("Items ");
        for(i=0;i<num1.length;i++)
        {
            num1[i]=in.nextInt();
        }
        System.out.println("Array :2 :: Enter element");
        int m= in.nextInt();
        int []num2=new int[m];
        System.out.println("Items");
        for(j=0;j<num2.length;j++)
        {
            num2[j]=in.nextInt();
        }
        
        if((num1[0]==num2[0]  && num1[n-1]!=num2[m-1]) || (num1[0]!=num2[0]  && num1[n-1]==num2[m-1]))
        {
            System.out.println("True");
        }
         
        
        else
        {
            System.out.println("False");
        }
        
        
    }
    
}
