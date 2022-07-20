 
package practices.after.xm;

import java.util.Scanner;

 
public class ObjectAndMethod {
    Scanner in=new Scanner(System.in);
    int a= in.nextInt();
    int b=30;
    
    public static void main(String []args){
        
        //Scanner in=new Scanner(System.in);
        //class_name oj_name=new class_name()
        ObjectAndMethod obj=new ObjectAndMethod();
         
        System.out.println("Access a ="+obj.a);
        System.out.println("Access b ="+obj.b);
                
    }
    
}
