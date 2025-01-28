package Test;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import Main.PrimeNumberChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private final int input;
    private final boolean expected;

    public PrimeNumberCheckerTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {2, true},  // Prime
            {6, false}, // Not prime
            {19, true}, // Prime
            {22, false}, // Not prime
            {23, true}  // Prime
        });
    }

    @Test
    public void testIsPrime() {
        assertEquals(expected, PrimeNumberChecker.checkNumber(input));
    }
}