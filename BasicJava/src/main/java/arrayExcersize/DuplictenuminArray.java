package arrayExcersize;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class DuplictenuminArray {
    public static void main(String[] args) {

        Integer[] a= new Integer[] {1,3,4,5,6,6,4,4,6};
        List<Integer> b= Arrays.asList(a);
//       Set<Integer> e= b.stream().filter(d-> Collections.frequency(b,d) >1).collect(Collectors.toSet());
//        System.out.println(e);

     Map<Integer,Integer> m= new HashMap<>();

       for(Integer f:b)
        {
            if(m.containsKey(f))
            {
                m.put(f,m.get(f)+1);
            }
            else
            {
               m.put(f,1);
            }
        }
        System.out.println(m);
    }
}
