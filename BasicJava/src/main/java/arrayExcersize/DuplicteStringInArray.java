package arrayExcersize;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicteStringInArray {
    public static void main(String[] args) {
        String[] a= new String[] {"a","b","s","s","a"};
        List<String> b= Arrays.asList(a);
       Set<String> d= b.stream().filter(c->Collections.frequency(b,c) >1).collect(Collectors.toSet());
        System.out.println(d);


    }
}
