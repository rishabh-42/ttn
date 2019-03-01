package Java8;

import java.util.Arrays;
import java.util.List;

public class Twelve {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);

        System.out.println("First even number in the list which is greater than 3 : "
                + list.stream().
                filter(a->a%2==0).
                filter(a->a>3).
                findFirst().get());
    }

}
