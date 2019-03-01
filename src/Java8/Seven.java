package Java8;

interface OverridingSeven {

    default void someMethod(){
        System.out.println("Inside Interface");
    }
}
public class Seven implements OverridingSeven {

    @Override
    public void someMethod() {
        System.out.println("Overridden in implementing class");
    }

    public static void main(String[] args) {
        new Seven().someMethod();
    }
}
