package numbers;

import org.junit.Test;

import static numbers.MetersToFeet.metersToFeet;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/2/18.
 */
public class MetersToFeetTest {
    
    @Test
    public void metersToFeetTest() throws Exception {
        
        double delta = 0.0001;
        
        double feet = 3 * 3.28;
        assertEquals("3 meters is equivalent to " + feet, feet, metersToFeet(3), delta);
        
        feet = 12.4 * 3.28;
        assertEquals("12.4 meters is equivalent to " + feet, feet, metersToFeet(12.4), delta);
        
    }
    
}