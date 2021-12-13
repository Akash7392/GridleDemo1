package kushAssignment1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MIssingNumInarray {
    public static void main(String[] args) {
        Integer[] a= new Integer[] {1,2,3,4,5,6,7,9,10};
        List<Integer> b= Arrays.asList(a);
        int maxnum=b.stream().mapToInt(x->x).max().getAsInt();
        int sumof_1_to_10= IntStream.rangeClosed(1,10).sum();
        int sumofelementinsidelist= b.stream().mapToInt(x->x).sum();
        int miss=sumof_1_to_10-sumofelementinsidelist;
        System.out.println(miss);
    }
}
