package Java2;

import java.util.Scanner;

public class Second {

    static int partition(char arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    static void sort(char arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s;
        System.out.println("Enter String : ");


        s = in.next();

        char arr[] = s.toCharArray();

        sort(arr, 0, arr.length - 1);
        System.out.println(arr);


    }
}
