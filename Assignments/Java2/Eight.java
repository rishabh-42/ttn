package Java2;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        String s ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Character : ");
        s= in.next();
        while(!s.equals("done")){

            if(s.charAt(0)==s.charAt(s.length()-1))
            {
                System.out.println("First & Last characters are equal ");
            }
            else
                System.out.println("Not equal");

            System.out.println("Enter Next Character");
            s=in.next();
        }
        System.out.println("Word entered is DONE, exiting now");

    }

}


class EightB {
    public static void main(String[] args) {
        String s ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Character : ");

        s=in.next();

        do{

            if(s.equals("done")){
                System.out.println("Word entered is DONE, exiting now");
                break;
            }
            else if(s.charAt(0)==s.charAt(s.length()-1))
            {
                System.out.println("First & Last characters are equal ");
            }
            else
                System.out.println("Not equal");

            System.out.println("Enter Next Character");
            s=in.next();

        }while(!s.equals("done"));

        System.out.println("Word entered is DONE, exiting now");

    }

}
