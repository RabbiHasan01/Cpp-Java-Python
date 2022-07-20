 
package assignment03;
 
//import java.util.Scanner;

public class _Movie_ {
    private String title;
    private String actor;
    private String rating;
    
    public _Movie_(String filmName,String actorName,String iMDBrating){
        title= filmName;
        actor= actorName;
        rating= iMDBrating;
                
    }
    public static void main(String[] args) {
       // Scanner in=new Scanner(System.in);
        //System.out.println("Give Inputs-----------");
        System.out.println("Answer to the Question no-1(d)");
        String filmName= "Lion King";
        String actorName= "Mosharrof Karim";
        String iMDBrating= "10";
        _Movie_  obj= new _Movie_(filmName,actorName,iMDBrating); //parameter=filmName,actorName,iMDBrating
        System.out.println("Outputs"); 
       
        System.out.println("Title = "+obj.title);
        System.out.println("Actor = "+obj.actor);
        System.out.println("IMDB Rating = "+obj.rating);
    }
}
