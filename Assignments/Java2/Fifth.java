package Java2;

public class Fifth implements Cloneable {

    String s;
    int i;

    public Fifth(String s, int i) {
        this.s = s;
        this.i = i;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public Fifth(Fifth f){
        this.s=f.s;
        this.i =f.i;
    }
}


class MainCLone{

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Using Clonable");
        Fifth fifth = new Fifth("hi",2);
        System.out.println("From original Object : "+fifth.s + " " + fifth.i);

        Fifth fifth1 = (Fifth) fifth.clone();

        System.out.println("From Cloned Object : " +fifth.s + " " + fifth.i);

        System.out.println("'-----------\nFrom Copy construcutor");

        Fifth fifth2 = new Fifth(fifth);
        System.out.println("From copy constructor : " +fifth2.s + " " + fifth2.i);


    }
}
