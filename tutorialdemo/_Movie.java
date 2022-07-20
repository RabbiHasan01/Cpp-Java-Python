
package tutorialdemo;

import java.util.*;
import java.lang.*;
import java.io.*;
public class _Movie {
    String title, actor;
    int rating;
 
    // Constructor
    public _Movie(int rating ,String title,
                   String  actor )
    {
        this.rating = rating;
        this.title = title;
        this.actor =  actor;
         
    }
 
    // Used to print student details in main()
    public String toString()
    {
        if(this.rating==10){
        return this.rating+" "+ this.title + " "
            + this.actor ;
        }
        else
            return " ";
    }
}
class MainM {
    public static void main(String[] args)
    {
        Student[] arr = { new Student(10,"Ainabazi", "Chonchol C."),
                          new Student(8,"RRR", "Ram C"),
                          new Student(6,"Wanted", " Salman Khan") };
 
        System.out.println("::::Outputs::::");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
 
        /*Arrays.sort(arr, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);*/
    }
}

