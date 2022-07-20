

package practices.after.xm;

public class Inheritance01 {
    
    String name="Rabbi Hasan";
    
    public void method01(){
        System.out.println("This is Method-01 "+name);
    }
    public  void method02(){
        System.out.println("This is Method-02 "+name);
    }
}
class Inheritance extends Inheritance01{
    int id=19701071;
    public void method03(){
        System.out.println("This is Method -03 "+id);
    }
}
class Main{
    public static void main(String[] args) {
        
        Inheritance obj= new Inheritance();
        obj.method01();
        obj.method02();
        obj.method03();
        System.out.println(obj.id+"  "+obj.name);
        
    }
 
}
