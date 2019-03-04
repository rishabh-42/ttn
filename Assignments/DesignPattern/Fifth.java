package DesignPattern;

public class Fifth {
}

interface Color {

    String getColor();
}

class Red implements Color {
    @Override
    public String getColor() {
        return "Red";
    }
}

class Blue implements Color {
    @Override
    public String getColor() {
        return "Blue";
    }
}

class Pink implements Color {
    @Override
    public String getColor() {
        return "Pink";
    }
}


abstract class Shape {

    String type;
    Color color;

    public Shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }
}

class Square extends Shape {

    public Square(Color color) {
        super("Square", color);
    }


}

class Rectangle extends Shape {

    public Rectangle(Color color) {
        super("Rectangle", color);

    }
}

class Triangle extends Shape {

    public Triangle(Color color) {
        super("Triangle", color);
    }
}

class BridgePattern {

    public static void main(String[] args) {
        Shape shape = new Square(new Red());
        System.out.println("Getting '" +shape.color.getColor()+"' " + shape.type);

        Shape shape1 = new Triangle(new Pink());
        System.out.println("Getting '" +shape1.color.getColor()+"' " + shape1.type);

        Shape shape2 = new Rectangle(new Blue());
        System.out.println("Getting '" +shape2.color.getColor()+"' " + shape2.type);


    }
}
