package labdemo;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int i,j,count=0;
       String str;
       
 str=input.nextLine();
int l=str.length();
int s=l/2-1;
if(l%2!=0)
{
    for(i=0;i<=s;i++)
    for (j=l-1;j>s+1;j--)
    {


   if((int)str[i]!=(int)str[j]) {
          count++;
        }

if (count==l/2)
System.out. printf("pallendrome");
 else System.out. printf("not");
    }
    else
    {
        for(i=0,j=l-1;i<=s,j>s;i++,j--){


    if(str[i]==str[j])
        count++;

    if(str[i]!=str[j])
    {
       // printf("not pallendrome");
        break;
    }
    }

if (count==l/2)
 System.out.printf("pallendrome");
 else 
         System.out. printf("not");
    }
    
