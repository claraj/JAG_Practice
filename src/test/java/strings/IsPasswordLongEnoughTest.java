package strings;

import org.junit.Test;

import static org.junit.Assert.*;
import static strings.IsPasswordLongEnough.isPasswordLongEnough;

/**
 * Created by clara on 2/8/18.
 */
public class IsPasswordLongEnoughTest {
    @Test
    public void testIsPasswordLongEnough8Orlonger() throws Exception {
    
        assertTrue("A password of 8 letters or longer is long enough", isPasswordLongEnough("Kanye West"));
        assertTrue("A password of 8 letters or longer is long enough", isPasswordLongEnough("Tacocat!"));
    }
    
    @Test
    public void testIsPasswordLongEnough7OrShorter() throws Exception {
        
        assertFalse("A password of fewer than 8 letters is not long enough", isPasswordLongEnough("tacocat"));
        assertFalse("A password of fewer than 8 letters is not long enough", isPasswordLongEnough("kanye"));
        
        
    }
    
}