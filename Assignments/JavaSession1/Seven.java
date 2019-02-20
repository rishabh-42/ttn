public class Seven {
    static String fname ="Rishabh";
    static String lname = "Rajput";

    static  {
        System.out.println("Printing in static block");
        System.out.println("First Name : Rishabh" );
        System.out.println("Last  Name : Rajput" );

    }

    public static void main(String[] args) {

        String firstName =  "Rishabh";
        String lastName = "Rajput";

        printName(firstName,lastName);

        System.out.println("\nPrinting through static variable");
        System.out.println("First Name : " + fname +"\n" +"Last Name : " +lname);

    }

    private static void printName(String firstName, String lastName) {
        System.out.println("\nPrinting in static method");
        System.out.println("First Name : " + firstName +"\n" +"Last Name : " +lastName );
    }



}
