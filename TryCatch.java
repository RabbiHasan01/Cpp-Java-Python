

package practices.after.xm;



public class TryCatch {
    public static void main(String[] args) {
        int  a=100;
        int b=0;
        float x=0;
        try
        {
            
            x=a/b;
            //System.out.println(x);
            
        }
        catch(Exception  ex){
            System.out.println(ex);
            System.out.println(x);
            System.out.println(a/(b+2));
            
        }
    }
}
