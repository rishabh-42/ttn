package Collection;

import java.util.*;

public class Third {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s= in.nextLine();

        Map<Character,Integer> charSetMap = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if(!charSetMap.containsKey(s.charAt(i)))
            {

                charSetMap.put(s.charAt(i),1);

            }
            else
            {
                charSetMap.put(s.charAt(i),charSetMap.get(s.charAt(i))+1);
            }

        }

        for(Character c: charSetMap.keySet())
        {
            System.out.println("'"+c+"' occured " + charSetMap.get(c) + " times");
        }



    }
}
