package objectoriented;

/**
 * Write a class representing a Rectangle
 * Methods:
 * double getArea()
 * double getPerimeter()
 *
 * @author Nicola Bicocchi
 */
public class Rectangle {
    double base;
    double altezza;

    public Rectangle(double b, double h){

        base = b;
        altezza = h;
    }

    double getArea(){
        return base * altezza;
    }

    double getPerimeter(){
        return base * 2 + altezza * 2;
    }
}
