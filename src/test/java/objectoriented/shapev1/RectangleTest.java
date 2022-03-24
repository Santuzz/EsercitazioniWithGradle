package objectoriented.shapev1;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.Shape;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getColor() {
        java.awt.Shape s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        assertEquals(Color.BLACK, s.getColor());
    }

    @Test
    void setColor() {
        java.awt.Shape s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        s.setColor(Color.YELLOW);
        assertEquals(Color.YELLOW, s.getColor());
    }

    @Test
    void isFilled() {
        java.awt.Shape s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        assertTrue(s.isFilled());
    }

    @Test
    void setFilled() {
        Shape s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        s.setFilled(false);
        assertFalse(s.isFilled());
    }

    @Test
    void getPerimeter() {
        java.awt.Rectangle s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        assertEquals(40, s.getPerimeter(), 0.01);
    }

    @Test
    void getArea() {
        java.awt.Rectangle s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        assertEquals(100, s.getArea(), 0.01);
    }

    @Test
    void resize() {
        java.awt.Rectangle s = new java.awt.Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        s.resize(2.0);
        assertEquals(new Point(-10, 10), s.getUpperLeft());
        assertEquals(new Point(10, -10), s.getBottomRight());
    }

    @Test
    void move() {
        java.awt.Rectangle s = new Rectangle(Color.BLACK, true, new Point(-10,10), new Point(0,0));
        s.move(new Point(10,-10));
        assertEquals(new Point(0, 0), s.getUpperLeft());
        assertEquals(new Point(10, -10), s.getBottomRight());
    }
}