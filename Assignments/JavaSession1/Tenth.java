public class Tenth {

    //adding two int
    public static  int add (int a , int b) {return a+b;}

    //adding two double
    public static double add (double a,double b ) { return  a+b;}

    //multiplying two float
    public  static float multiply (float a ,float b ){return a*b;};

    //multiplying two int
    public static  int multiply (int a ,int b) {return a*b;}

    //concate two strings
    public static StringBuffer conacate(StringBuffer a ,StringBuffer b ){return a.append(b);}

    //concate three strings
    public static StringBuffer conacate(StringBuffer a ,StringBuffer b ,StringBuffer c ){return (a.append(b)).append(c);}



    public static void main(String[] args) {

        System.out.println("Addition of two Integers : " + add(1,2) + "\n");
        System.out.println("Addition of two Doubles : " + add(1.2,2.5) + "\n");
        System.out.println("Multiplication of two floats : " + multiply(1.2f,2.3f) + "\n");
        System.out.println("Multiplication of two Integers : " + multiply(10,24) + "\n");
        System.out.println("Concating two Strings : " + conacate(new StringBuffer("one "),
                new StringBuffer("two ")) + "\n");
        System.out.println("Concating three Strings : " + conacate(new StringBuffer("one "),
                new StringBuffer("two "),new StringBuffer("three ")) + "\n");

    }

}
