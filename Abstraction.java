

package practices.after.xm;

abstract class Animal{
    public abstract void sound();
    
    public void type(){
        System.out.println("Vertibrates");
    }
}
class Man extends Animal{
    
    public void sound(){
        System.out.println("WOW WOW");               
    }
    
}
public class Abstraction {
    public static void main(String[] args) {
        Animal obj1=new Man();
        obj1.sound();
        obj1.type();
        
    }
}
