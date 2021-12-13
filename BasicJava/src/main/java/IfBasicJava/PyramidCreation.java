package IfBasicJava;

public class PyramidCreation {
    public static void main(String[] args) {

        for(int i=1 ;i <=4;i++)
        {
           for(int j=4;j>=1;j--) {
               if (j > i) {
                   System.out.print(" ");
               } else {
                   System.out.print(" "+i);
               }
           }
            System.out.println();
        }

    }
}
