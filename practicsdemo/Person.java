
package practicsdemo;

import java.util.Scanner;

public class Person {
   private String name; ///if u don't use "private",this code retrurn previous result.
   // private = restricte access
// Getter
public String getName() {
return name;
}
// Setter
public void setName(String newName) {
this.name = newName;
}
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String name;
      Person myObj = new Person();
      myObj.setName(in.nextLine()); // Set the value of the nam variable to "John"
      System.out.println(myObj.getName());
    }        
    
}
