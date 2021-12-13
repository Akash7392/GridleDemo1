package arrayExcersize;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayContsinsNO {
    public static void main(String[] args) {

        Integer[] a= new Integer[] {3,2,5,6,7};
        Integer[] ac= new Integer[5];
        String[] s= new String[] {"as","ad","df","aa"};
        List<Integer> b= Arrays.asList(a);

        List<String> cc=Arrays.asList(s);
       boolean bb= b.stream().anyMatch(c->c.equals(5));
        System.out.println(bb);
       boolean sd= cc.stream().anyMatch(ab->ab.contains("aaa"));
        System.out.println(sd);



    }
}
