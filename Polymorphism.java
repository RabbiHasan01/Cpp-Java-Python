

package practices.after.xm;

class A{//Super class
    public void method(){
        System.out.println("This is class A");
    }
}
class B extends A{//sub Class
    public void method(){
        System.out.println("This is class B");
    }
}
class C extends A{ //Sub class
    public void method(){
        System.out.println("This is class C");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        
        A objA=new A();
        objA.method();
        
        A objB=new B();
        objB.method();
        
        A objC=new C();
        objC.method();
    }
}
