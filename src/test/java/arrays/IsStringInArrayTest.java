package arrays;

import org.junit.Test;

import static arrays.IsStringInArray.languageInArray;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/8/18.
 */
public class IsStringInArrayTest {
    @Test
    public void testLanguageInArray() throws Exception {
        
        assertTrue(languageInArray("Java", new String[]{"Java", "Python", "C#"}));
        assertTrue(languageInArray("PyThOn", new String[]{"Java", "Python", "C#"}));
        assertTrue(languageInArray("PYTHON", new String[]{"Java", "Python", "C#"}));
        assertTrue(languageInArray("c#", new String[]{"Java", "Python", "C#"}));
        
    }
    
    
    @Test
    public void testLanguageNotInArray() throws Exception {
        
        assertFalse(languageInArray(" Java ", new String[]{"Java", "Python", "C#"}));
        assertFalse(languageInArray("Swift", new String[]{"Java", "Python", "C#"}));
        assertFalse(languageInArray("Ruby", new String[]{"Java", "Python", "C#"}));
        assertFalse(languageInArray("c", new String[]{"Java", "Python", "C#"}));
        
    }
    
}