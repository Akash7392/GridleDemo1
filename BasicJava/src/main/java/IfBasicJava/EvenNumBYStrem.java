package IfBasicJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumBYStrem {
    public static void main(String[] args) {
        Integer[] a= new Integer[] {8,5,9,5,4,7,6};
        List<Integer> b= Arrays.asList(a);

      b.stream().filter(c->c%2==0).forEach(c-> System.out.println(c));



    }
}
