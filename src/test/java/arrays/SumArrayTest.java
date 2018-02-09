package arrays;

import org.junit.Test;

import static arrays.SumArray.sumArray;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/8/18.
 */
public class SumArrayTest {
    @Test
    public void testSumArray() throws Exception {
        
        assertEquals(10, sumArray(new int[]{1, 2, 3, 4}));
        assertEquals(15, sumArray(new int[]{4, 5, 3, 1, 2}));
        
    }
    
}