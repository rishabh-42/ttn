package Java2;

import java.util.Scanner;

public class Seven {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Seconds :");

        long i =in.nextLong();

        double days= (double)i/(24*60*60);
        double hours =(double) i/(60*60);
        double minutes = (double) i/60;

        System.out.println("No. of Days = "+days);
        System.out.println("No. of Hours = "+hours);
        System.out.println("No. of Minutes = "+minutes);

    }
}
