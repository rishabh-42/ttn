package Java2;

class Parent extends Grandparent {

    {
        System.out.println("instance - parent");
    }
    public Parent() {
        System.out.println("constructor - parent");
    }
    static {
        System.out.println("static - parent");
    }
}
class Grandparent {

    static {
        System.out.println("static - grandparent");
    }
    {
        System.out.println("instance - grandparent");
    }
    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}
class Child extends Parent {
    public Child() {
        System.out.println("constructor - child");
    }
    static {
        System.out.println("static - child");
    }
    {
        System.out.println("instance - child");
    }
}

class  Main1 {
    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        int i =0;
        while(i<10)
        {
            s = s + i;
            int j=i;
            while(j>0){
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);

        i++;
        }
        System.out.println("S is " + s);



    }

}