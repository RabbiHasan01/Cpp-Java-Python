

package labexam;


abstract class Student01 {//abstract class
    String name,id;
    int phone;
    abstract void information();//abstract method =doesn't have a body
}
 class ThirdSemester extends Student01 {
     String labExam;
     
     public void studentInfo(String name,String id,int phone,String labExam){
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.labExam=labExam;
         
     }
      public void information(){
          System.out.println("This is abstract method");
      }
     public void displayinformation( ){
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
        System.out.println("Phone is "+phone);
        System.out.println("Lab Exam is "+labExam);
        
     }
    
}
class MainClass{
    public static void main(String[] args){
        ThirdSemester  obj=new ThirdSemester();
        obj.studentInfo("Rabbi Hasan","19701071",01761,"CSE-312");
        obj.displayinformation();
        Student01 obj_=new ThirdSemester();         
        obj.information();
        
    }
}
