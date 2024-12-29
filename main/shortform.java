package main;

import java.util.Scanner;

public class shortform {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                System.out.println("Enter the 3 word name");
                String str,sub="";
                str=sc.nextLine();
                int pos=0,k;
                char ch=' ',ch1=' ';
                for(k=0;k<str.length();k++)
                {
                    if(pos==0)
                    {
                        ch=str.charAt(pos);
                    }
                    
                    
                    if(str.indexOf(' ')!=-1)
                    {
                       ch1=str.charAt(str.indexOf(' ')+1);
                       
                    }             
                
                    if(str.lastIndexOf(' ')!=-1)
                    {
                        sub=str.substring(str.lastIndexOf(' ')+1);
                    }
                }
                System.out.println("The short name is : " +ch+"."+ch1+"."+sub);
        
        
    }

}
