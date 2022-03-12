package objectoriented;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static java.lang.Math.*;

/**
 * Write a Java class representing a Circle (Point center, int radius) capable of moving on a 2D plane
 * Methods:
 * double getArea()
 * double getPerimeter()
 * boolean contains(Point point)
 * void moveUp()
 * void moveDown()
 * void moveLeft()
 * void moveRight()
 *
 * @author Nicola Bicocchi
 */
public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getPerimeter() {
        return radius * 2 * PI;
    }

    public boolean contains(@NotNull Point gen){
        return sqrt(pow(center.x - gen.getX(),2) + pow(center.y - gen.getY(),2)) <= radius;
    }

    public void moveUp(){
        center.y+= 1;
    }
    public void moveDown(){
        center.y-= 1;
    }
    public void moveLeft(){
        center.x-= 1;
    }

    public void moveRight(){
        center.x+= 1;
    }


}
