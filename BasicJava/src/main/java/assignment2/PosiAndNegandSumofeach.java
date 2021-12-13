package assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PosiAndNegandSumofeach {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>(Arrays.asList(2,3,5,-8,-9,-4));
        List<Integer> b=a.stream().filter(x->x>0).collect(Collectors.toList());
        List <Integer> c= a.stream().filter(x->x<0).collect(Collectors.toList());
        int bs=b.stream().mapToInt(x->x).sum();
        int cs=c.stream().mapToInt(x->x).sum();
        System.out.println(bs);
        System.out.println(cs);
    }
}
