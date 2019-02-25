import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        System.out.println("Write a program to replace a substring inside a string with other string ? \n");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = in.nextLine();

        System.out.print("\nEnter Substring to be replaced : ");
        String subStr = in.nextLine();




        System.out.print("\nEnter new substring :");
        String newStr = in.nextLine();


        //replacing substring
        str = str.replace(subStr, newStr);


        System.out.println("Resultant string is : " + str);

    }
}
