package DesignPattern;

public class First {
    @Override
    public String toString() {
        return "First{" +
                "s='" + s + '\'' +
                '}';
    }

    private String s;

    private First() {
        s = "Dummy class";
    }

    private volatile static First instance = null;

    public static First getInstance() {
        if (instance == null) //Single Checked
            synchronized (First.class) {
                if (instance == null) //Double Checked
                    instance = new First();
            }
        return instance;
    }
}

class Main {


    public static void main(String[] args) {

        First obj1 = First.getInstance();
        First obj2 = First.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
