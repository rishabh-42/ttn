package Java8;

interface FirstInterface {

    default void someMethod(){
        System.out.println("From FirstInterface");
    }
}

interface SecondInterface {
    default void someMethod(){
        System.out.println("From SecondInterface");
    }

}
public class Eight implements FirstInterface,SecondInterface {
    @Override
    public void someMethod() {
        System.out.println("Multiple Inheritance Achieved");
        FirstInterface.super.someMethod();
        SecondInterface.super.someMethod();
    }

    public static void main(String[] args) {
        new Eight().someMethod();
    }
}
