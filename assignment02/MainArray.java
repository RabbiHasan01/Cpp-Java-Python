 
package assignment02;
 
import static assignment02.DuplicateNum.deleteDuplicate;
import static assignment02.PairSum.sumpair;
import static assignment02.SpecifyArray.contains;
import java.util.Arrays;
import static assignment02.insertArray.insert;
import java.util.Scanner;
 
public class MainArray {
     
public static void main(String[] args) {

Scanner input= new Scanner (System.in);
 System.out.println("Enter the index no : ");
int n=input.nextInt();
 
 
int [] array = new int [n];
int len=array.length;
System.out.println ("Please enter nunber to the array");
for ( int i =0; i<len; i++)
{ 
array [i]= input.nextInt();
} 

    System.out.println("Subprogram :1 :: Remove duplicate :");
 deleteDuplicate(array,len);
 
    System.out.println("Subprogram :2 :: Check number which the array containing : "); 
System.out.print("Input the number to test here");
int value = input.nextInt();
 contains(array,value);
  
  System.out.println("Subprogram :3 :: Input item and position :");
     int item=input.nextInt();
     int pos=input.nextInt();
    array= insert(array,item,pos);
    System.out.println(Arrays.toString(array));
  
    System.out.println("Subprogram :4 :: Search same pair of array");
     sumpair(array,len);
 
}

     
}
 
