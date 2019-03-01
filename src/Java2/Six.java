package Java2;

public class Six {

    public static void main(String[] args) {

        try {
            int i =0;
            int y = 10/i;
        }
        catch (NumberFormatException | NullPointerException e )
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block will execute always");
        }
    }
}
