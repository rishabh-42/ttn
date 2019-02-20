import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        StringBuffer str = new StringBuffer();
        str.append(in.nextLine());

        str = str.reverse().delete(4,9);

        System.out.println("Desired string is : " + str);
    }
}
