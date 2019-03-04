package Java2;

public class FourSingelton {

    private static FourSingelton fourSingelton = null;

    public volatile int testVariable;

    private FourSingelton(){
        testVariable=10;


    }
    public static FourSingelton getInstance(){

        if(fourSingelton ==null){
           fourSingelton = new FourSingelton();


        }
        return fourSingelton;
    }

    //
}

class Main {

    public static void main(String[] args) {
        FourSingelton fourSingelton1 = FourSingelton.getInstance();

        System.out.println("Value is : " + fourSingelton1.testVariable);
                fourSingelton1.testVariable++;

        FourSingelton fourSingelton2 = FourSingelton.getInstance();

        System.out.println("Value is  : " + fourSingelton2.testVariable);
    }
}
