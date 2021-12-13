package IfBasicJava;

import java.util.Scanner;

public class OwelOrConsonent {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("enter the char");
        char c= s.next().charAt(0);

        System.out.println("enter the char=");
        if ((c >='a' && c<= 'z') || (c>='A' && c<='Z'))
        {
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u')
            {
                System.out.println("vowel");
            }
            else
            {
                System.out.println("consonent");
            }

        }
        else
        {
            System.out.println("invalid char");
        }



    }



}
