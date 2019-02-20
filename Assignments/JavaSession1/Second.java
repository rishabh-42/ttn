import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        System.out.println("2. Write a program to find the number of occurrences of the" +
                " duplicate words in a string and print them ?\n\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = in.nextLine();
        System.out.println();

        Map<String, Integer> count = wordCount(str);

        for (String s : count.keySet()) {
            System.out.println("Word '" + s + "' occurred " + count.get(s) + " times.\n");
        }


    }

    private static Map<String, Integer> wordCount(String str) {
        HashMap<String, Integer> countOfWord = new HashMap<String, Integer>();

        for (int i = 0; i < str.length(); i++) {
            int j = i, flag = 0;
            while (!Character.isWhitespace(str.charAt(j))) {

                if (j + 1 == str.length()) {
                    flag = 1; // to set value of j equal to length of string
                    break;
                }
                j++;

            }

            if (flag == 1) j++;

            StringBuilder word = new StringBuilder("");
            for (int k = i; k < j; k++) word.append(str.charAt(k));
            i = j--;

            if (countOfWord.containsKey(word.toString())) {

                int val = (countOfWord.get(word.toString())) + 1;
                //System.out.println(val);
                countOfWord.put(word.toString(), val);

            } else {

                countOfWord.put(word.toString(), 1);
            }

        }
        return countOfWord;
    }
}
