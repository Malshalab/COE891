package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Main.checkPhoneNumber;

public class checkPhoneNumberTest {

    @Test
    public void testValidPhoneNumbers() {
        assertTrue(checkPhoneNumber.checkPhoneNumbers("(123)123-1234"));     // Without spaces
        assertTrue(checkPhoneNumber.checkPhoneNumbers("(123) 123 - 1234")); // With spaces
        assertTrue(checkPhoneNumber.checkPhoneNumbers("123 123-1234"));     // Without parentheses
        assertTrue(checkPhoneNumber.checkPhoneNumbers("(123)123 − 1234"));  // Unicode dash
        assertTrue(checkPhoneNumber.checkPhoneNumbers("(123) 456-7890"));   // Standard format
    }

    @Test
    public void testInvalidPhoneNumbers() {
   
        assertFalse(checkPhoneNumber.checkPhoneNumbers("123-123-12345"));   // Too many digits
        assertFalse(checkPhoneNumber.checkPhoneNumbers("(123) 123"));       // Missing digits
        assertFalse(checkPhoneNumber.checkPhoneNumbers("abc-def-ghij"));    // Non-numeric characters
        assertFalse(checkPhoneNumber.checkPhoneNumbers("(123)-123-1234"));  // Incorrect format
        assertFalse(checkPhoneNumber.checkPhoneNumbers("123 123 1234"));    // Missing dash
    }
}