package IfBasicJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FloatingNocompare {
    public static void main(String[] args) {
    //     DecimalFormat df= new DecimalFormat("#.##");
        Scanner s= new Scanner(System.in);
        System.out.println("enter tthe two float no");
       double f1=s.nextDouble();
       double f2=s.nextDouble();
      String fs1=String.format("%.2f",f1);
      String fs2=String.format("%.2f",f2);
        System.out.println("decimal no="+fs1);
        if(fs1.equals(fs2))
        {
            System.out.println("no are equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }
}
