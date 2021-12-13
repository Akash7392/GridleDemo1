package arrayExcersize;

import java.util.Arrays;
import java.util.List;

public class MInandMAxNo {
    public static void main(String[] args) {

        Integer[] a=new Integer[] {4,2,5,6,8};
        List<Integer>b= Arrays.asList(a);
        Integer c=b.stream().mapToInt(d->d).max().getAsInt();
       int  m=b.stream().mapToInt(d->d).min().getAsInt();
        System.out.println(c);
        System.out.println(m);

    }
}
