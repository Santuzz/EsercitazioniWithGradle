package objectoriented;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a class named Polygon representing an irregular polygon.
 * Internally, the class represents an irregular polygon as an array of 2d points (vertices).
 *
 * Supported methods:
 * int getVerticesNumber() - returns the number of vertices
 * Point[] getVertices() - returns the array of vertices
 * void move(Point movement) - moves the polygon as specified by movement (treated as a vector)
 * double getArea() - returns the area of the polygon, computed using the formula that can be found here
 * (https://arachnoid.com/area_irregular_polygon/index.html)
 *
 * @author Nicola Bicocchi
 */
public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices) {

        this.vertices = vertices;
    }

    public int getVerticesNumber(){
        return vertices.length;
    }

    public Point[] getVertices(){
        return vertices;
    }

    public void move(Point movement){
        for(Point pos : vertices) {
            pos.x += movement.x;
            pos.y += movement.y;
        }
    }

    public double getArea(){
        double a = 0;
        for(int i = 0; i < vertices.length-1; i++){
            a +=vertices[i+1].x * vertices[i].y - vertices[i+1].y * vertices[i].y;
        }
        return a/2;
    }


}
