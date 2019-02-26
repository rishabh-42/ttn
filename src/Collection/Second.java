package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Second {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s= in.nextLine();

        Set<Character> charSet = new HashSet<>();

        for(int i=0;i<s.length();i++) {
            charSet.add(s.charAt(i));
        }

        System.out.println("Number of unique characters in String are : " + charSet.size());
    }
}
