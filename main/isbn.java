package main;

import java.util.*;

public class isbn
{
     
    public static void main(String[]args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the ISBN number");
        long isbn=sc.nextLong();
        int sum=0,digit=0,count=0;
        while(isbn!=0)
        {
            digit=(int) (isbn%10);
            isbn/=10;
            count++;
        }
        if(count!=10)
        {
            System.out.println("Illigal ISBN number");
        }
        else
        {
            for(int i=10;i>=10;i--)
            {
                sum+=i*digit;
            }
            if(sum%11==10)
            {
                System.out.println("ISBN number is valid ");
            }
            else
            {
                System.out.println("ISBn is invalid ");
            }
        }
    }
}


        

        




    
