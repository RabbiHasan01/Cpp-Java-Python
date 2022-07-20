 
package practicsdemo;

import java.util.Scanner;

 
public class PracticsDemo002 { /*
     public static void main(String[] args) {
        
         Scanner in=new Scanner(System.in);
       
         String s,subs;
         System.out.println("Enter string :: ");
         s=in.nextLine();
         System.out.println("Enter substring :: ");
         subs=in.nextLine();
         
         System.out.println(s.indexOf(subs));
         
         
         
         
    }
} */


// Create a MyClass class
//public class MyClass {
int x; // Create a class attribute
// Create a class constructor for the MyClass class
public MyClass() {
x = 5; // Set the initial value for the class attribute x
}
public static void main(String[] args) {
MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
System.out.println(myObj.x); // Print the value of x
}
}
// Outputs 5
//Object Oriented Programming: Java
//Constructor 