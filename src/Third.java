import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = in.nextLine();
        System.out.println("Enter Character : ");
        char chr= in.next().charAt(0);

        int count = str.length() - str.replaceAll(String.valueOf(chr), "").length();
        System.out.println("Occurrence Of "+ chr +" Char In String: " + count);
    }
}
