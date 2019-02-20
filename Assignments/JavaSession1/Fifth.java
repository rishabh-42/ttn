import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size of first Array : ");
        int sizeFirst = in.nextInt();

        int firstArr[] = new int[sizeFirst];
        System.out.println("Enter elements of first array separated by space");
        for (int i = 0; i < sizeFirst; i++) firstArr[i] = in.nextInt();

        System.out.println("Enter Size of Second Array : ");
        int sizeSecond = in.nextInt();

        int secondArr[] = new int[sizeSecond];
        System.out.println("Enter elements of second array separated by space");
        for (int i = 0; i < sizeSecond; i++) secondArr[i] = in.nextInt();
        System.out.println("Common elements are :");
        printCommon(firstArr, secondArr);
    }

    private static void printCommon(int[] firstArr, int[] secondArr) {
        List<Integer> commonEle = new ArrayList<>();

        for (int i = 0; i < firstArr.length; i++)
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[i]) {
                    if (!commonEle.contains(firstArr[i])) {
                        commonEle.add(firstArr[i]);

                    }
                    break;
                }
            }
        for (int i : commonEle) {
            System.out.println(i);
        }
    }
}
