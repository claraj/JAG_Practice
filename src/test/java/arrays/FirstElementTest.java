package arrays;

import org.junit.Test;

import static arrays.FirstElement.firstElement;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/8/18.
 */
public class FirstElementTest {
    @Test
    public void testFirstElement() throws Exception {
        
        assertEquals("Return element 0 from the array", "Python", firstElement( new String[]{"Python", "Java", "C#"}));
        assertEquals("Return element 0 from the array", "Cake", firstElement( new String[]{"Cake", "Pizza", "Tacos"}));
        
    }
    
}