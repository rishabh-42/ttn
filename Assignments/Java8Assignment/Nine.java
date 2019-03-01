package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nine {

    public static void main(String[] args) {
        System.out.println("Collecting all Even Numbers");
        List<Integer> list = Arrays.asList(10,12,14,15,1,18,18,16,19,17,12,15,15,15,15,15,15,16);

        List<Integer> evenonly = list.stream().filter((a)->a%2==0).collect(Collectors.toList());

        System.out.println(evenonly);
    }
}
