 
package assignment03;
 
import java.util.Scanner;

public class Movie {
    
    private String title;
    private String actor;
    private String rating;
    
    public Movie(String filmName, String actorName,String iMDBrating ){  //constructor //Argument=filmName,actorName,iMDBrating
        title= filmName;
        actor= actorName;
        rating= iMDBrating;
                
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Answer to the Question no-1(a)");
        System.out.println("Give Inputs");
        System.out.print("Film Name = ");
        String filmName=in.nextLine();
        System.out.print("Actor Name = ");
        String actorName=in.nextLine();
        System.out.print("IMDb Rating = ");
        String iMDBrating=in.nextLine();
        Movie  obj= new Movie(filmName,actorName,iMDBrating); //parameter=filmName,actorName,iMDBrating
         System.out.println();
        System.out.println("Outputs");
        System.out.println("Title = "+obj.title);
        System.out.println("Actor = "+obj.actor);
        System.out.println("IMDB Rating = "+obj.rating);
    }
}
