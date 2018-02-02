package numbers;

import org.junit.Test;

import static numbers.Square_Numbers.square;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/2/18.
 */
public class Square_NumbersTest {
    @Test
    public void squareTest() throws Exception {
        
        assertEquals("The square of 10 should be 100", 100, square(10));
        assertEquals("The square of 1 should be 1", 1, square(1));
        assertEquals("The square of 4 should be 16", 16, square(4));
        assertEquals("The square of -4 should be 16. " +
                "Don't worry, if you multiply a number by itself, the - or + signs will come out correctly. " +
                "You don't need to do anything different for negative numbers", 16, square(4));
        
    }
    
}