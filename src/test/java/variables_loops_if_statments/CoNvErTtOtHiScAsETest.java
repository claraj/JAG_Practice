package variables_loops_if_statments;

import org.junit.Test;

import static org.junit.Assert.*;
import static variables_loops_if_statments.CoNvErTtOtHiScAsE.annoyingCase;

/**
 * Created by clara on 2/2/18.
 */
public class CoNvErTtOtHiScAsETest {
    @Test
    public void annoyingCaseTest() throws Exception {
        
        String msg = "Convert the string to alternate uppercase and lowercase letters. Skip over spaces, punctuation, and any other character not a-z or A-Z." +
                " Compare actual and expected results.";
        assertEquals(msg,  "hElLo", annoyingCase("Hello"));
        assertEquals(msg,  "hElLo WoRlD", annoyingCase("Hello World"));
        assertEquals(msg,  "wHaT's ThE pOiNt Of ThIs?", annoyingCase("What's the point of this?"));
    
    
    }
    
}