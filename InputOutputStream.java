 
package practices.after.xm;

import java.util.Scanner;

 
public class InputOutputStream {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z,sum,dif,mul,div,mod;
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        sum=x+y+z;
        mul=x*y*z;
        System.out.println("Summation is = "+sum );
        System.out.println("Multiplication is ="+mul);
    }
}
