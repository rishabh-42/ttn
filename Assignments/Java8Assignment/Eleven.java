package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Eleven {
    public static void main(String[] args) {
        System.out.println("Average after doubling");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);

        //different approch in next commented line , not suitable for all cases
        //avg=list.stream().map(a->a*2).collect(Collectors.averagingInt(a->a));
        OptionalDouble optionalDouble =
                        list.
                        stream().
                        mapToInt(a -> a * 2).
                        average();

        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }


        //System.out.println(avg);
    }
}
