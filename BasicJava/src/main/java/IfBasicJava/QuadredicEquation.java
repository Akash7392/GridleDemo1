package IfBasicJava;

import java.util.Scanner;

public class QuadredicEquation {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of a, b, c");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        double result=(b*b-4.0*a*c);
          result=Math.pow(result,0.5);
        if(result > 0)
        {
            double r1=(-b+result)/2*a;
            double r2=(-b-result)/2*a;
            System.out.println("r1="+r1+"   r2="+r2);
        }
        else if(result==0.0)
        {
            double r2 =-b/2.0*0;
            System.out.println("r2="+r2);
        }
         else
            System.out.println("does not have real root");
    }
}
