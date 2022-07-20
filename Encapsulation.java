

package practices.after.xm;

import java.util.Scanner;



public class Encapsulation {
    
    private int x,y;
    
    public void setMethod(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int getMethod(){
        return x+y;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        
        Encapsulation obj=new Encapsulation();
        obj.setMethod(a,b);
        int sum=obj.getMethod();
        System.out.println("Summation is = "+sum);
        
      
        
        
    }
}
