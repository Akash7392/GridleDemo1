package arrayExcersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate {
    public static void main(String[] args) {
        List<String> a= new ArrayList<>(Arrays.asList("aa","aa","as","as","ag"));
        List<String> b=a.stream().distinct().collect(Collectors.toList());
        System.out.println(b);
    }
}
