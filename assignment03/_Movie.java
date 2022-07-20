  
package assignment03;

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class _Movie {
    
    String title;
    String actor;
    int rating;
    
    public _Movie(String title,String actor,int rating){//setter
        this.title=title;
        this.actor=actor;
        this.rating=rating;
        if(this.rating==10){
            System.out.println ("Movie Title '"+this.title+"'");
            System.out.println ("Actor Name '"+this.actor+"'");
            System.out.println ("Movie Rating '"+this.rating+"'");
            
        }
       
    }
    
    public static void main(String[] args) {
        
        System.out.println("Answer to the Question no-1(c)");
         _Movie[] movies={new _Movie("RRR","Ram C.",9),//Class type array
            new _Movie("Itihas","K Maruf.",8),
            new _Movie("Ainabazi","Chonckol C.",10)};
              
        
    }
    
}
