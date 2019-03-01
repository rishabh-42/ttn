package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Five {


    public static void main(String[] args) {
        Consumer<Integer> consumer = (a)->{};
        Supplier<Integer> supplier= ()->5;
        Predicate<Integer> predicate = (a)->a%2==0;
        Function<Integer,Integer> function =(a)->a*2;

        //return void
        consumer.accept(new Integer(5));

        System.out.println("From supplier : " + supplier.get());
        System.out.println("Predicate (Even or Odd) " + predicate.test(new Integer(5)));

        System.out.println("Function : " + function.apply(new Integer(5)));



    }
}
