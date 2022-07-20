

package practices.after.xm;

/**
 *
 * @author HP
 */
public class Finally {
    public static void main(String[] args) {
        
        int a=100;
        int b=0;
        float x;
        try{
            x=a/b;
            System.out.println(x);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
            System.out.println("Arithmetic Exception handled");
        }
        finally{
            System.out.println("Always Runniong");
        }
    }
}
