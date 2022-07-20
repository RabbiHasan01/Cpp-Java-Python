

package labexam;



public class Student {
    String name,id;
    int phone;
    public void student(String name,String id,int phone){//constractor 
        this.name=name;
        this.id=id;
        this.phone=phone;
    }
    public void display(){
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
        System.out.println("Phone is "+phone);
    }
}
class Main{
    public static void main(String[] args){
        Student obj01=new Student();
        obj01.student("Rabbi Hasan", "19701071",01761);
        obj01.display();
        Student obj02=new Student();
        obj02.student("Hasan Mia", "19701069", 017666);
        obj02.display();
        
        
    }
}