package IfBasicJava;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the desire no=");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
     if (a==b && b==c && c==a)
     {
         System.out.println("all no are equals");
     }
     else {
         if (a > b && a > c) {
             System.out.println("a is greater=" + a);
         } else if (b > c) {
             System.out.println("b is greater no=" + b);
         } else
             System.out.println("c is the greater no=" + c);
     }
    }
}
