import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = in.nextInt();

        int Arr[] = new int[size];
        System.out.println("Enter elements of array separated by space according to condition given");
        for (int i = 0; i < size; i++) Arr[i] = in.nextInt();

        int temp = Arr[0];
        //XOR of all the elements will give element occuring one time
        for(int i=1;i<size;i++) temp=temp^Arr[i];

        System.out.println("Element occuring one time is : " +temp);
    }
}
