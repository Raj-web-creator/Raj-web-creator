package main;

import java.util.Scanner;

public class palin {

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the word to check whether it is a pallindronme or not");
  String str = sc.nextLine();
  String rev="",copystr=str;
  int len=str.length();
  for(int i=0;i<len;i++){
    rev=str.substring(len-i-1,len-i);
  }
  if(rev==copystr)
  {
    System.out.println("The word is a pallindrom ");}
    else{
        System.out.println("The word is not a pallinome ");

    }
  }
  }



