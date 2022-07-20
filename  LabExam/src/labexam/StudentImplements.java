

package labexam;



interface Student02 {//interface class

    public void studentinfo(String name,String id,int phone);//interface method
}


public class StudentImplements implements Student02{

    public void studentinfo(String myName,String myId,int myPhone){
        System.out.println("Name is "+myName);
        System.out.println("ID is "+myId);
        System.out.println("Phone is "+myPhone);
    }
    
}
class MyMainClass{
    public static void main(String[] args){
        Student02 myobj=new StudentImplements();
        myobj.studentinfo("Rabbi Hasan", "19701071",7077);
        
    }
}