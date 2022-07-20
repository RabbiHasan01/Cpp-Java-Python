///pdf.page=22(Abstruct Method & Class)
public class MyClass01 {
    public static void main(String[] args) {
// create an object of the Student class (which inherits attributesand methods from Person)
Student myObj;
        myObj = new Student();
System.out.println("Name: " + myObj.fname);
System.out.println("Age: " + myObj.age);
System.out.println("Graduation Year: " + myObj.graduationYear);
myObj.study(); // call abstract method
}    
}