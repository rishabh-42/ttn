package Collection;

import java.lang.reflect.Array;
import java.util.*;

public class Sixth {
    public static void main(String[] args) {

        char arr[] = new char[]{'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'b', 'b', 'b', 'b', 'b', 'a', '1', '2', '2'};


        Map<Character, Integer> eleFrequency = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!eleFrequency.containsKey(arr[i])) {
                eleFrequency.put(arr[i], 1);

            } else {

                eleFrequency.put(arr[i], eleFrequency.get(arr[i]) + 1);
            }
        }


        List<Map.Entry<Character, Integer>> entryList = new ArrayList<Map.Entry<Character, Integer>>(eleFrequency.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });


        Map<Character, Integer> sortedEle = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedEle.put(entry.getKey(), entry.getValue());
            System.out.println("Element '" + entry.getKey() + "' occured  " + entry.getValue() + " time(s)");
        }


    }


}
