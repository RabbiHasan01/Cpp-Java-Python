 
package assignment03;

import java.util.Scanner;

  
public class Movie_ {
    
    private String title;
    private String actor;
    private String rating;
    
    public Movie_(String filmName, String actorName ){  //constructor //Argument=filmName,actorName,iMDBrating
        title= filmName;
        actor= actorName;
        rating="10";
                
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Answer to the Question no-1(b)");
        System.out.println("Give Inputs");
        String filmName=in.nextLine();
        String actorName=in.nextLine();
       // String iMDBrating=in.nextLine();
        Movie_  obj= new Movie_(filmName,actorName); //parameter=filmName,actorName,iMDBrating
        System.out.println();
        System.out.println("Outputs");
        System.out.println("Title = "+obj.title);
        System.out.println("Actor = "+obj.actor);
        System.out.println("IMDB Rating = "+obj.rating);
    }
 
}
