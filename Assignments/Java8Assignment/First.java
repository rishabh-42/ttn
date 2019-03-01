package Java8;

import java.util.Collections;

@FunctionalInterface
interface CheckGreater {

    boolean check(int a, int b);
}

@FunctionalInterface
interface Increment {
    int increment (int a);
}

@FunctionalInterface
interface Concat {

    StringBuffer concat(StringBuffer a,StringBuffer b);
}

interface UpperCase {

    StringBuffer upperCase (StringBuffer a);

}

public class First {

    public static void main(String[] args) {


        CheckGreater checkGreater = (a,b)-> a>b?true:false;

        System.out.println("Checking between two numbers : " + checkGreater.check(5,8));

        Increment increment = (a)->++a;
        System.out.println("Incrementing the number By 1 : " + increment.increment(5));

        Concat concat = (a,b)->a.append(b);
        System.out.println("Concating two strings : " + concat.concat(new StringBuffer("abc"),new StringBuffer("def")));

        UpperCase upperCase =  (a)->new StringBuffer(a.toString().toUpperCase());
        System.out.println("Converting to upper case : " + upperCase.upperCase(new StringBuffer("lower case to upper case")));
    }

}
