package arrayExcersize;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;

public class SrotingIntegerAndStringArray {
    public static void main(String[] args) {
        Integer[] a= new Integer[] {1,5,3,2,4};
        Integer[] c= new Integer[] {1,5,3,2,4};
        String[] s= new String[] {"a","c","b","z","y"};
        int[] b=new int[5];

        List<Integer> l=Arrays.asList(a);

        List<String> ss=Arrays.asList(s);
        List<Integer> cs=Arrays.asList(c);
        System.out.println(ss.stream().sorted().collect(Collectors.toList()));
        System.out.println(l.stream().sorted().collect(Collectors.toList()));
        Collections.reverse(l);
        Collections.reverse(ss);
        System.out.println(l);
        System.out.println(ss);
        Integer sum=l.stream().mapToInt(x->x).sum();
        System.out.println(sum);
        Integer sm=l.stream().reduce(0,(aa,bb)->(aa+bb));
        System.out.println(sm);

   }

}
