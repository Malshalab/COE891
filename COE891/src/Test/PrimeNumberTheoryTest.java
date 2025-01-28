package Test;

import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import Main.PrimeNumberChecker;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PrimeNumberTheoryTest {

    @DataPoints
    public static int[] testNumbers = {2, 6, 19, 22, 23, -1, 0, 1, 97, 100};

    @Theory
    public void testIsPrime(int number) {
        assumeTrue(number > 1); 
   
        if (number == 2 || number == 19 || number == 23 || number == 97) {
            assertTrue("Number should be prime: " + number, PrimeNumberChecker.checkNumber(number));
        } else {
            assertFalse("Number should not be prime: " + number, PrimeNumberChecker.checkNumber(number));
        }
    }

    @Theory
    public void testInvalidNumbers(int number) {
        assumeTrue(number <= 1); 
        assertFalse("Number should not be prime: " + number, PrimeNumberChecker.checkNumber(number));
    }
}