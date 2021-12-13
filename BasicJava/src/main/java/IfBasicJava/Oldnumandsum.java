package IfBasicJava;

import java.util.Scanner;

public class Oldnumandsum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no=");
        int a=s.nextInt();
        int sum=0;
        for(int i=1; i<=a ;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
                sum=sum+i;
            }

        }
        System.out.println("sum="+sum);
    }
}
