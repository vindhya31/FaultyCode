import static org.junit.Assert.*;

import org.example.UtilityFunctions;
import org.junit.Assert;
import org.junit.Test;

public class UtilityFunctionsTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(5, UtilityFunctions.add(2, 3));
    }

    @Test
    public void testIsEven() {
        assertTrue(UtilityFunctions.isEven(4));
        assertFalse(UtilityFunctions.isEven(5));
    }

    @Test
    public void testMax() {
        assertEquals(5, UtilityFunctions.max(3, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, UtilityFunctions.multiply(2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        UtilityFunctions.factorial(-1);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, UtilityFunctions.factorial(5));
    }

    @Test
    public void testFibonacci() {
        assertEquals(5, UtilityFunctions.fibonacci(5));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(UtilityFunctions.isPalindrome("madam"));
        assertFalse(UtilityFunctions.isPalindrome("java"));
    }

    @Test
    public void testGCD() {
        assertEquals(6, UtilityFunctions.gcd(24, 18));
    }

    @Test
    public void testReverseString() {
        assertEquals("avaJ", UtilityFunctions.reverseString("Java"));
    }

    @Test
    public void testIsPrime() {
        assertTrue(UtilityFunctions.isPrime(7));
        assertFalse(UtilityFunctions.isPrime(4));
    }


    // Additional test methods can be added here...
}
