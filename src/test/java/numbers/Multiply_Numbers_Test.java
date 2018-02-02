package numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static numbers.Multiply_Numbers.*;

public class Multiply_Numbers_Test {
    
    @Test(timeout=3000)
    public void testAddNumbers() {

        assertEquals("Multiplying the numbers 1 and 100 should return 100", 100, multiplyNumbers(1, 100));
        assertEquals("Multiplying the numbers 6 and 10 should return 60", 60, multiplyNumbers(6, 10));
        assertEquals("Multiplying the numbers -6 and -100 should return 600", 600, multiplyNumbers(-6, -100));
        assertEquals("Multiplying the numbers -6 and 2 should return -12", -12, multiplyNumbers(-6, 2));
        assertEquals("Multiplying the numbers 3 and 3 should return 9", 9, multiplyNumbers(3, 3));
    
    }
    
}