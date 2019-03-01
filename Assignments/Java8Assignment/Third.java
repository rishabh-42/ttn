package Java8;

@FunctionalInterface
interface AdditionOfNumbwers {
    int add(int a, int b);
}

@FunctionalInterface
interface SubstractionOfTwo {
    int sub(int a, int b);
}

@FunctionalInterface
interface Multiply{
    int mul(int a,int b);
}

public class Third {

     int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a+b;
    }

    static  int mul(int a,int b){
         return a*b;
    }

    public static void main(String[] args) {

        System.out.println("Non-static method referencing\n");
        AdditionOfNumbwers additionOfNumbwers = new Third()::add;
        System.out.println("Adding two number : " + additionOfNumbwers.add(1,2));

        SubstractionOfTwo substractionOfTwo =new Third()::sub;
        System.out.println("Substracting two number : "+ substractionOfTwo.sub(5,4));

        System.out.println("\nStatic method reference\n");

        Multiply multiply =Third::mul;
        System.out.println("Multiplication of numbers : "+ multiply.mul(5,8));



    }
}

