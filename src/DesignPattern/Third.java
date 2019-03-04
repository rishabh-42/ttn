package DesignPattern;

public class Third {
    public static void main(String[] args) {
        System.out.println("For third question");
    }
}


enum CarType {
    MINI, MICRO, LUXURY;
}

enum CarLocation {
    India, USA, Japan;
}

abstract class Car {
    abstract void seeDetails();

    CarType carType;
    CarLocation location;

    public Car(CarType carType, CarLocation location) {
        this.carType = carType;
        this.location = location;
        System.out.println("Car location is : " + location);
    }


}

class Mini extends Car {


    public Mini(CarType carType, CarLocation location) {
        super(carType, location);
        this.type = carType;

    }

    CarType type;

    @Override
    void seeDetails() {
        System.out.println("Car type is : " + this.type);

    }
}

class Micro extends Car {
    @Override
    void seeDetails() {
        System.out.println("Car type is : " + this.type);

    }

    CarType type;

    public Micro(CarType carType, CarLocation location) {
        super(carType, location);
        this.type = carType;
    }
}

class Luxury extends Car {

    private  CarLocation carLocation;
    @Override
    void seeDetails() {
        System.out.println("Car type is : " + this.type);



    }

    CarType type;

    public Luxury(CarType carType, CarLocation location) {
        super(carType, location);
        this.type = carType;
    }
}

class IndianCarFactory {


    public static Car getCar(CarType type) {
        Car car = null;
        switch (type) {
            case MINI: {
                car = new Mini(type, CarLocation.India);
                break;
            }
            case MICRO: {
                car = new Micro(type, CarLocation.India);
                break;

            }
            case LUXURY: {
                car = new Luxury(type, CarLocation.India);
                break;
            }
        }
        return car;

    }
}

class USACarFactory {


    public static Car getCar(CarType type) {
        Car car = null;
        switch (type) {
            case MINI: {
                car = new Mini(type, CarLocation.USA);
                break;
            }
            case MICRO: {
                car = new Micro(type, CarLocation.USA);
                break;

            }
            case LUXURY: {
                car = new Luxury(type, CarLocation.USA);
                break;
            }
        }
        return car;

    }
}

class JapanCarFactory {


    public static Car getCar(CarType type) {
        Car car = null;
        switch (type) {
            case MINI: {
                car = new Mini(type, CarLocation.Japan);
                break;
            }
            case MICRO: {
                car = new Micro(type, CarLocation.Japan);
                break;

            }
            case LUXURY: {
                car = new Luxury(type, CarLocation.Japan);
                break;
            }
        }
        return car;

    }
}

class CarFactory {

    static Car getCar(CarType type, CarLocation location) {
        Car car = null;
        switch (location) {
            case India: {
                car = IndianCarFactory.getCar(type);
                break;
            }
            case USA: {
                car = IndianCarFactory.getCar(type);
                break;

            }
            case Japan: {
                car = IndianCarFactory.getCar(type);
                break;
            }
        }
        return car;
    }
}


class AbstractFactory {

    public static void main(String[] args) {

        CarFactory.getCar(CarType.MICRO, CarLocation.India).seeDetails();
        System.out.println("-----------------------");
        CarFactory.getCar(CarType.MINI,CarLocation.USA).seeDetails();

    }
}