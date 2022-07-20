/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practices.after.xm;

/**
 *
 * @author HP
 */
public class Throws {
    
    static void fun() throws Exception{
        
        System.out.println("theows here");
        throw new Exception  ("");
    }
    public static void main(String[] args) {
        
        try{
            fun();
        }
        catch(Exception e){
            System.out.println("No problem");
        }
    }
}
