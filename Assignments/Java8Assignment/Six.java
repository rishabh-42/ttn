package Java8;

interface StaticAndDefaultTest {
    static void someOtherMethod(){
        System.out.println("Printing from staic method");

    }

    default void someMethod(){
        System.out.println("Printing from default method");
    }
}
public class Six implements StaticAndDefaultTest {

    public static void main(String[] args) {

        StaticAndDefaultTest.someOtherMethod();

        new Six().someMethod();
    }
}
