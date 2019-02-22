import java.text.DecimalFormat;
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = in.nextLine();

        int stringLengthWithoutWhiteSpaces = str.length() - str.replace(" ", "").length();

        int countSmall = 0, countCapital = 0, countSpecial = 0, countDigits =0;

        for (int i = 0; i < str.length(); i++) {
            //
            if (str.charAt(i) == ' ') continue;

            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) countCapital++;
            else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) countSmall++;
            else if(str.charAt(i) >= 48 && str.charAt(i) <= 57) countDigits++;
            else countSpecial++;
        }

        float perSpecial = (float) countSpecial * 100 / (str.length() - stringLengthWithoutWhiteSpaces);
        float perSmall = (float) countSmall * 100 / (str.length() - stringLengthWithoutWhiteSpaces);
        float perCapital = (float) countCapital * 100 / (str.length() - stringLengthWithoutWhiteSpaces);
        float perDigits = (float) countDigits* 100 / (str.length() - stringLengthWithoutWhiteSpaces);

        System.out.println("Lowercase Letters Count: " + countSmall);
        System.out.format("Lowercase Letters Percentage : %.3f", perSmall);
        System.out.println("\n");

        System.out.println("Uppercase Letters Count: " + countCapital);
        System.out.format("Lowercase Letters Percentage: %.3f", perCapital);
        System.out.println("\n");

        System.out.println("Special Character Count: " + countSpecial);
        System.out.format("Special Character Percentage: %.3f", perSpecial);
        System.out.println("\n");

        System.out.println("Digits Count: " + countDigits);
        System.out.format("Special Character Percentage: %.3f", perDigits);
        System.out.println("\n");
    }
}
