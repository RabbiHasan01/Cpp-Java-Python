/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchinjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SwitchInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input =new Scanner(System.in); 
       int number;
       number=  input .nextInt();
       
       int i;
       i= input.nextInt();
       
       switch(number)
       {
           
           case  i<0: 
               System.out.println("ZERO");
               break;
           case 1:
               System.out .println("ONE");
               break;
           case 2:
               System.out.println("TWO");
               break;
               
           case 3: 
               System.out.println("THREE");
               break;
           case 4:
               System.out .println(" FOUR");
               break;
           case 5:
               System.out.println("FIVE");
               break;
           case 6: 
               System.out.println("SIX");
               break;
           case 7:
               System.out .println("SEVEN");
               break;
           case 8:
               System.out.println("EIGHT");
               break;
           case 9:
               System.out.println("NINE");
               break;
           default:
               System.out.println("Sorry! The number is no matching.");
               
       }
        
               }

    
}
