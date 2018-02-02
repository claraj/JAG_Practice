package ifstatements;

import org.junit.Test;

import static ifstatements.IsProgrammingCourse.boolToIsOrIsNot;
import static ifstatements.IsProgrammingCourse.isProgrammingClass;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/2/18.
 */
public class IsProgrammingCourseTest {
    
    
    @Test
    public void boolToIsOrIsNotTest() throws Exception {
        
        assertEquals("If boolean is true, return \"is\"", "is", boolToIsOrIsNot(true));
        assertEquals("If boolean is false, return \"is not\"", "is not", boolToIsOrIsNot(false));
        
    }
    
    @Test
    public void isProgrammingClassTest() throws Exception {
    
        String java = "Java Programming";
        String csharp = "C# Programming";
        String web = "Web Client & Server Programming";
        
        String msg = "Check if the string is equal to one of the three strings java, csharp or web. The check should be case-insensitive.";
        
        assertTrue(msg, isProgrammingClass(java.toLowerCase()));
        assertTrue(msg, isProgrammingClass(java.toUpperCase()));
        assertTrue(msg, isProgrammingClass(java));
        
        assertTrue(msg, isProgrammingClass(csharp.toLowerCase()));
        assertTrue(msg, isProgrammingClass(csharp.toUpperCase()));
        assertTrue(msg, isProgrammingClass(csharp));
    
        assertTrue(msg, isProgrammingClass(web.toLowerCase()));
        assertTrue(msg, isProgrammingClass(web.toUpperCase()));
        assertTrue(msg, isProgrammingClass(web));
    
        assertFalse(msg, isProgrammingClass("Introduction to Criminal Justice"));
        assertFalse(msg, isProgrammingClass("Spanish 1"));
        assertFalse(msg, isProgrammingClass("Java Prog"));
    
    }
    
}