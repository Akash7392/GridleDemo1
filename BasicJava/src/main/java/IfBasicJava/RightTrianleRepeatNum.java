package IfBasicJava;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RightTrianleRepeatNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no=");
        int a= s.nextInt();
        for(int i=1; i<=a ; i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
