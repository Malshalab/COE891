package Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

import Main.Fibonacci;

@RunWith(Theories.class)
public class FibonacciTheoriesTest {

 
    @DataPoints
    public static int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 20, 30};

    @Theory
    public void testValidFibonacci(int n) {
        assumeTrue(n >= 0); 
        int[] expectedResults = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 6765, 832040};
        if (n < expectedResults.length) {
            assertEquals("Fibonacci computation failed for input: " + n, expectedResults[n], Fibonacci.compute(n));
        }
    }


    @Theory
    public void testNegativeFibonacci(int n) {
        assumeTrue(n < 0); 
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.compute(n));
    }

    
    @Theory
    public void testLargeFibonacci(int n) {
        assumeTrue(n == 20 || n == 30); 
        if (n == 20) {
            assertEquals(6765, Fibonacci.compute(20));
        } else if (n == 30) {
            assertEquals(832040, Fibonacci.compute(30));
        }
    }
}