//pdf.page=25(Topic : Encapsulation)
//Q:Don't pass more than one variables/attributes?;;,,,,,...
import java.util.Scanner;
/*public class MyClass02 {
/*public static void main(String[] args) {
Person02 myObj = new Person02();
myObj.name = "John"; // error
System.out.println(myObj.name); // error
}
}
*/
public class MyClass02 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
Person02 myObj = new Person02();
String s;
s=input.nextLine();//user addition.....
//c=input.nextLine();
myObj.setName(s); // Set the value of the name variable to "John"
System.out.println(myObj.getName());
}
}