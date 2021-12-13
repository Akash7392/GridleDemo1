package IfBasicJava;

import java.util.Scanner;

public class TableOfGivenNO {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no for table=");
        int m=s.nextInt();
        int table=1;
        for(int i=1; i<=10; i++)
        {
           table=m*i;
            System.out.println("table="+table);
        }
    }


}
