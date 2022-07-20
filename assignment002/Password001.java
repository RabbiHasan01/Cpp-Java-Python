 
package assignment002;

import java.util.Scanner;

 
public class Password001 {
 
public static void passwordChecker(){
Scanner input = new Scanner(System.in);
System.out.println("Input the password!");
String password = input.next();
char[] passchar = password.toCharArray();
char ch1 = password.charAt(0);
 
char character;
int  Count = 0;
int digitCount = 0;
    for (int i = 0; i < passchar.length; i++){
        character = passchar[i];
  
    if (character < 48 || character > 57 && character < 65 || character > 90 && character < 97 || character > 122){
     Count++;
    }
    if (character > 47 && character < 58){
    digitCount++;
    }
    }


    if (passchar.length < 8){
        System.out.println("Invalid   password! ");
    }
    else if ( Count != 0){
        System.out.println(" Invalid  password!");
    }
    else if (digitCount < 2){
        System.out.println("Invalid password!");
    }

    else if(ch1>='A'&& ch1<='Z')
    {
        System.out.println("Password is valid ");
    }
    else
        System.out.println("Invalid password!");
    }
}



