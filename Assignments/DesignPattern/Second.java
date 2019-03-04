package DesignPattern;


interface Polygon {

    void makePolygon();
}

class Quadrilateral implements Polygon {



    @Override
    public void makePolygon() {

        System.out.println("No. of sides = 4 -> Quadrilateral");


    }
}

class Pentagon implements Polygon {

    @Override
    public void makePolygon() {

        System.out.println("No. of sides = 5 -> Pentagon");


    }
}

class Hexagon implements Polygon {



    @Override
    public void makePolygon() {

        System.out.println("No. of sides = 6 -> Hexagon");


    }
}

//Factoryfor polygon
public class Second {

    Polygon polygon;

    public Polygon getPolygon() {
        return polygon;
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }
}

class PolygonFactory {

    static Second getPolygon(int sides) {
        Second second = new Second();
        switch (sides) {
            case 4: {
                second.setPolygon(new Quadrilateral());
                break;
            }
            case 5 :{
                second.setPolygon(new Pentagon());
                break;
            }
            case 6:
            {
                second.setPolygon(new Hexagon());
            }
        }
        return second;
    }
}

class PolygonPattern {
    public static void main(String[] args) {

        Second quadrilateral = PolygonFactory.getPolygon(4);
        quadrilateral.polygon.makePolygon();

        Second pentagon = PolygonFactory.getPolygon(5);
        pentagon.getPolygon().makePolygon();

        Second hexagon = PolygonFactory.getPolygon(6);
        hexagon.getPolygon().makePolygon();


    }


}
