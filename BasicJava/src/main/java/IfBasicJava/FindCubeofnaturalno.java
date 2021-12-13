package IfBasicJava;

import java.util.Scanner;

public class FindCubeofnaturalno {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no=");
        int a=s.nextInt();
        int cube=1;
        for(int i=1 ; i<=a ;i++)
        {
            cube=i*i*i;
            System.out.println("cube="+cube);
        }


    }
}
