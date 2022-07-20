
package practicsdemo;

abstract class SubAbstructPerson {
public String fname = "John";
public int age = 24;
public abstract void study(); // abstract method ***Not mandatory for exicution 
}
// Subclass (inherit from Person)
class Student extends SubAbstructPerson {
public int graduationYear = 2018;
 public void study() { // the body of the abstract method
System.out.println("Studying all day long");
}
}
