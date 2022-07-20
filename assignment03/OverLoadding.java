 
package assignment03;


class Case01{
    //Different Data Type....
    public void method01(String name,int id,int age){
        
        System.out.println("This is 'Method-01'.");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println( "Age : " +age);
       
    }
    
    public void method01(String deptName, String university){
        System.out.println("This is 'Method-01'.");
        System.out.println("Dept Name : "+deptName);
        System.out.println("University Name : "+university);
    }
    
}
class  Case02{
    //Different Data  Sequence.....
    public void method02(String name,int id,int age){
        
        System.out.println("This is 'Method-02'.");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println( "Age : " +age);
       
    }
    public void method02(int id,String name,int age){
        
        System.out.println("This is 'Method-02'.");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : " +age);
       
    }
}
  
public class OverLoadding {
 
    public static void main(String[] args) {
        
        System.out.println("Answer to the Question no-3");
        System.out.println("CASE-01:::: Different Data Type....");
        Case01 obj01=new Case01();
        obj01.method01( "Rabbi Hasan", 19701071, 21);
        System.out.println();
        obj01.method01("Dept of C.S.E.", "U of Chittagong");
        
        System.out.println();
        System.out.println(); 
        System.out.println("CASE-02:::: Different Data Sequence.....");
        Case02 obj02=new Case02();
        obj02.method02( "Rabbi Hasan", 19701071, 21);
        System.out.println();
        obj02.method02( 19701071,"Rabbi Hasan", 21);
    }
 
}
