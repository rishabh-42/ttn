package DesignPattern;

public class Sixth {
}

interface Pizza {
    void getDetails();
}

class CheesePizza implements Pizza {

    @Override
    public void getDetails() {
        System.out.println("Cheese Pizza");
    }
}

class CornPizza implements Pizza {
    @Override
    public void getDetails() {
        System.out.println("Corn Pizza");
    }
}

class PizzaWithTopping implements Pizza {
    String typeOfTopping;
    Pizza pizza;

    @Override
    public void getDetails() {
        pizza.getDetails();
        System.out.print("With " + typeOfTopping);
    }

    public PizzaWithTopping(String typeOfTopping, Pizza pizza) {
        this.typeOfTopping = typeOfTopping;
        this.pizza = pizza;
    }


}

class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new CheesePizza();
        pizza.getDetails();
        Pizza pizza1 = new CornPizza();
        pizza1.getDetails();

        Pizza pizzaWithTopping = new PizzaWithTopping("Pepperoni", new CheesePizza());
        pizzaWithTopping.getDetails();
    }
}