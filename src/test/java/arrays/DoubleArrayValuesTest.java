package arrays;

import org.junit.Test;

import static arrays.DoubleArrayValues.doubleArray;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/2/18.
 */
public class DoubleArrayValuesTest {
    @Test
    public void doubleArrayTest() throws Exception {
        
        String msg = "Create and return a new array, with all of the values in the original array doubled.";
        assertArrayEquals(msg, new int[]{}, doubleArray(new int[]{}));
        assertArrayEquals(msg, new int[]{2, 6}, doubleArray(new int[]{1, 3}));
        assertArrayEquals(msg, new int[]{198, 80, 24, 12, 84}, doubleArray(new int[]{99, 40, 12, 6, 42}));
        assertArrayEquals(msg, new int[]{0, -18, -2, -200}, doubleArray(new int[]{0, -9, -1, -100}));
    
    }
    
}