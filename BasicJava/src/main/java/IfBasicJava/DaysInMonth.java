package IfBasicJava;

import java.util.Scanner;

public class DaysInMonth {

    public static int getDaysInMOnth(int i, int year )
    {
        int dayInmonth=0;
        String nameofmonth="";
        switch(i)
        {
            case 1:
                nameofmonth="Jan";
                dayInmonth=31;
                break;
            case 2:
                nameofmonth="feb";
                if((year%400==0) || ((year%4==0) && (year%100 !=0)) )
                {
                    dayInmonth=29;

                }
                else
                {
                    dayInmonth=28;
                }
            break;
            case 3:
                nameofmonth="Mar";
                dayInmonth=31;
                break;
            case 4:
                nameofmonth="Apr";
                dayInmonth=30;
                break;
            case 5:
                nameofmonth="May";
                dayInmonth=31;
                break;
            case 6:
             nameofmonth="June";
             dayInmonth=30;
             break;
            case 7:
             nameofmonth="Jul";
             dayInmonth=30;
             break;
            case 8:
                nameofmonth="Aug";
                dayInmonth=31;
                break;
            case 9:
                nameofmonth="Sep";
                dayInmonth=30;
                break;
            case 10:
                nameofmonth="Oct";
                dayInmonth=31;
                break;
            case 11:
                nameofmonth="Nov";
                dayInmonth=30;
                break;
            case 12:
                nameofmonth="Dec";
                dayInmonth=31;
                break;
            default:
                System.out.println("not a valid no");

        }
        return dayInmonth;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter month and year");
        int month=s.nextInt();
        int yr=s.nextInt();
        System.out.println(getDaysInMOnth(month,yr));

    }

}
