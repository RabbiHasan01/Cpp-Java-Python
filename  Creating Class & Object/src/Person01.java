  // abstract class
abstract class Person01 {
public String fname = "John";
public int age = 24;
public abstract void study(); // abstract method
}
// Subclass (inherit from Person)
class Student extends Person01 {
public int graduationYear = 2018;
@Override
public void study() { // the body of the abstract method
System.out.println("Studying all day long");
}
}
