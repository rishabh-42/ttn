package Java8;

@FunctionalInterface
interface TakesTwoReturnOne {
    int returnOne(int a,int b);
}
public class Second {


    public static void main(String[] args) {
        TakesTwoReturnOne takesTwoReturnOne = (a,b)->a;
        System.out.println("Returning one variable : " + takesTwoReturnOne.returnOne(1,2));
    }
}
