 
package assignment03;

import java.util.Scanner;

//part-1 
public class Carnival {
    int numOfGuest;
    public void setNumOfGuest(int newNumOfGuest){
        this.numOfGuest=newNumOfGuest;
    }
    public int getNumOfGuest(){
        return  numOfGuest;
    }
    public void display(){
        System.out.println("Welcome to the Carnival.");
    }
   
}
//part-2
class CarnivalMain{
     public static void main(String[] args) {
         System.out.println("Answer to the Question no-2");
         Scanner in =new Scanner(System.in);
         Scanner input =new Scanner(System.in);
         
         System.out.print("Number of Guest is = ");
         int guestNum=in.nextInt();
         
         System.out.print("Getting Menu Name = ");
         String myMenu=input.nextLine();
         //Carnival  obj=new Carnival();
         
         CarnivalMeal obj=new CarnivalMeal();
         Carnival objMeal=new Carnival();
         
         objMeal.setNumOfGuest(guestNum);
         obj.setMenu(myMenu);
         
         System.out.println("\nNumber of  Guest = "+objMeal.getNumOfGuest());
         System.out.println("Menu is '"+obj.getMenu()+"'.");
         
         obj.display();
                 
     }
 }
//part-3
class CarnivalMeal extends Carnival{
    protected String menu;
    public void setMenu(String menuName){
        menu=menuName;
    }
    public String getMenu(){
        return menu;
    }
    
}