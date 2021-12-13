package IfBasicJava;

import java.util.Scanner;

public class GetweekDayByswitch {

    public static String getweekDays(int d)
    {
        String wd="";
        switch(d)
        {
            case 1:
                wd="Mon";
                break;
            case 2:
                wd="Tues";
                break;
            case 3:
                wd="Wed";
                break;
            case 4:
                wd="thus";
                break;
            case 5:
                wd="Fri";
                break;
            case 6:
                wd="Sat";
                break;
            case 7:
                wd="sun";
                break;
            default:
                System.out.println("not valid no");
        }
        return wd;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter days no=");
        int d= s.nextInt();
        if(d>=1 && d <=7)
        {
            System.out.println("week day="+getweekDays(d));
        }
        else
            System.out.println("no is not in the given range");

    }
}
