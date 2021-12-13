package kushAssignment1;

import java.util.Arrays;
import java.util.List;

public class ArrayEquality {
    public static void main(String[] args) {
        Integer[] a=new Integer[] {21, 57, 11, 37, 24};
        Integer[] b=new Integer[] {21, 57, 11, 37, 24};
        List<Integer> aa= Arrays.asList(a);
        List<Integer> bb= Arrays.asList(b);
        boolean t=aa.equals(bb);
        System.out.println(t);
    }
}
