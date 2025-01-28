package Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.assertTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MathematicalTheoryTest {

    @DataPoints
    public static int[] val = {1, 2, 307, 400567};

    @DataPoints
    public static int[] newval = {0, -1, -10, -1234, 1, 10, 6789};

    @Theory
    public void testAdditionGreaterThanOperands(int a, int b) {
        assumeTrue(a > 0 && b > 0); // Skip invalid values like 0 or negatives
        assertTrue("a + b should be greater than a", a + b > a);
        assertTrue("a + b should be greater than b", a + b > b);
    }

    // Theory: a + b = b + a (commutative property)
    @Theory
    public void testAdditionCommutative(int a, int b) {
        assertTrue("Addition should be commutative", a + b == b + a);
    }


    @Theory
    public void testNewvalEdgeCases(int a, int b) {
        assumeTrue(a > 0 && b > 0); 
        assertTrue("a + b should be greater than a", a + b > a);
        assertTrue("a + b should be greater than b", a + b > b);
    }
}