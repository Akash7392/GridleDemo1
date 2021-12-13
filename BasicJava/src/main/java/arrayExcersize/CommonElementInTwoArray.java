package arrayExcersize;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementInTwoArray {

    public static void main(String[] args) {
        List<String> l1= new ArrayList<>(Arrays.asList("aa","ab","as","ad","af"));
        List<String> l2= new ArrayList<>(Arrays.asList("aa","ah","as"));

        List<String> com= l1.stream().distinct().filter(l2::contains).collect(Collectors.toList());
        System.out.println(com);
    }



}
