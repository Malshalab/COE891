package Test;

import Main.Triangle;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    private Triangle t1, t2, t3, t4, t5, t6;

    @Before
    public void setUp() {
        t1 = new Triangle(3, 4, 5);  // Valid triangle
        t2 = new Triangle(5, 4, 3);  // Valid triangle
        t3 = new Triangle(8, 5, 5);  // Valid triangle
        t4 = new Triangle(1, 2, 10); // Invalid triangle
        t5 = new Triangle(-3, 4, 5); // Invalid triangle
        t6 = new Triangle(1, 1, 2);  // Degenerate triangle
    }

    @Test
    public void testCalculateAreaForValidTriangles() {
    	System.out.println("t1 Area: " + t1.calculateArea());
        System.out.println("t2 Area: " + t2.calculateArea());
        System.out.println("t3 Area: " + t3.calculateArea());
        System.out.println("t6 Area: " + t6.calculateArea()); 
        
        assertEquals(6.0, t1.calculateArea(), 0.001);
        assertEquals(6.0, t2.calculateArea(), 0.001);
        assertEquals(12.0, t3.calculateArea(), 0.001);
        assertEquals(0, t6.calculateArea(), 0.001); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTriangleSides() {
        t4.calculateArea(); // Should throw IllegalArgumentException
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSideLength() {
        t5.calculateArea(); // Should throw IllegalArgumentException
    }

    @Test
    public void testAreaEquality() {
        double areaT1 = t1.calculateArea();
        double areaT2 = t2.calculateArea();
        assertEquals(areaT1, areaT2, 0.001);
    }
}