package IfBasicJava;

import java.util.Scanner;

public class SumAndAvg5no {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the 5 no");
        int f=s.nextInt();
        int[] a= new int[5];
        for(int i=0 ; i<=4 ; i++)
        {
            a[i]=s.nextInt();
        }

   int sum=0;

        for (int d:a)
        {
            sum=sum+d;

        }

      int av=sum/a.length;
        System.out.println("sum="+sum+"  "+ "avg="+av);
    }
}
