

package practices.after.xm;

interface Animals{
    public void type();
            
    public void sound();
    
}
class Men implements Animals{
    public void type(){
        System.out.println("Mammals");
    }
    public void sound(){
        System.out.println("wow wow");
    }
}
public class Interface {
    public static void main(String[] args) {
        
        Animals obj =new Men();
        obj.sound();
        obj.type();
        
    }
}
