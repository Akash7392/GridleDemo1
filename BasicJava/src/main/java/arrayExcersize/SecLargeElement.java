package arrayExcersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecLargeElement {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>(Arrays.asList(2,3,4,1,9));
        List<Integer> b=a.stream().sorted().collect(Collectors.toList());

        int c=b.get(b.size()-2);
        System.out.println(c);

    }
}
