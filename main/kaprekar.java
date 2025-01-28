package main;
import java.util.*;
public class kaprekar
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();int copy=n;int sq=n*n;              
        String sub1="",sub2="",s1=String.valueOf(sq);      
        int len=s1.length();
        sub1=s1.substring(0,len/2);  sub2=s1.substring(len/2,len);
        int convert1=Integer.parseInt(sub1);  
        int convert2=Integer.parseInt(sub2);        
        if(convert1+convert2==copy)
         System.out.println(copy+" is a kaprekar number");
        else
         System.out.println(copy+" is not a kaprekar number");
        }
    }
 
