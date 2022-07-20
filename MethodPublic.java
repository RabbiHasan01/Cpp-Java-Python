 
package practices.after.xm;
 
public class MethodPublic {
    public String myMethod(String str,int x, int y){
        //
        //x=299;
        str="In public, must be created object";               
        System.out.println(str);
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
        return str;
        
    }
    public static void main(String[] args) {
         
        int x=23;
        int y=33;  
        String str ="THIS IS PUBLIC  METHOD";
        MethodPublic obj=new MethodPublic();
        //String s=obj.myMethod();
        //obj.myMethodx);
        obj.myMethod( str,x, y);
         
        
    }

}
