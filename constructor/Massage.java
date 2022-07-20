
package constructor;

import java.util.Scanner;


public class Massage {
    
    private String str;
    
    public void  displayMassage(){
         
        Scanner in=new Scanner(System.in);
        System.out.print("Here the story :");
        String s=in.nextLine();
        str=in.nextLine();
        System.out.println(str);
    }
    
}
