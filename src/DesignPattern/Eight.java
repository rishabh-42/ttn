package DesignPattern;

public class Eight {
}

class Driver{
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


interface Drivable {
    void drive();
}

class CarNew implements Drivable{

    protected Driver driver;

    public CarNew(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("drive the car");
    }
}

class CarProxy  extends CarNew{

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if(driver.getAge()<21){
            System.out.println("You can't drive the car");
        }else {
            System.out.println("you can drive");
            super.drive();
        }
    }
}

class Proxy {

    public static void main(String[] args) {
        Driver rishabh= new Driver(21);
        Drivable car= new CarProxy(rishabh);
        car.drive();

        Driver chotu= new Driver(19);
        Drivable car1= new CarProxy(chotu);
        car.drive();
    }
}

