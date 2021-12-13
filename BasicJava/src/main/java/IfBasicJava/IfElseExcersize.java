package IfBasicJava;

import java.util.Scanner;

public class IfElseExcersize {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the your no=");
        int a=s.nextInt();
        System.out.println(a);

        if(a>0)
        {
            System.out.println("no is positive");
        }
           else if(a==0)
        {
            System.out.println("equal to Zero");
        }
       else
       {
           System.out.println("no is negative");
       }


    }











}
