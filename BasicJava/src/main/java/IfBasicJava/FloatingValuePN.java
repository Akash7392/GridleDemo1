package IfBasicJava;

import java.util.Scanner;

public class FloatingValuePN {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no=");
        double d=s.nextDouble();
        if(d>0)
        {
          if (d< 1)
          {
              System.out.println("small");
          }
             else if(d> 100000)
          {
              System.out.println("large");
          }
             else
          {
              System.out.println("no is positive");
          }

        }
        else if(d<0)
        {
              if(Math.abs(d) < 1)
              {
                  System.out.println("small l");
              }
              else if(Math.abs(d) > 100000)
              {
                  System.out.println("large l");
              }
              else
              {
                  System.out.println("negtive l");
              }

        }
        else
        {
            System.out.println("zero");
        }
    }
}
