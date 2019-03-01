package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ten {

    public static void main(String[] args) {
        System.out.println("Sum of number greater than 5");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);

        int sum=0;
        sum = list.stream().filter((a)->a>5).collect(Collectors.summingInt(a->a));
        System.out.println(sum);
    }
}
