package Java2;

public class Third {

    public static void main(String[] args) {


        System.out.println("Class Not Found Exception");
        try

        {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        }catch (ClassNotFoundException e)

        {

            e.printStackTrace();

        }


    }
}


