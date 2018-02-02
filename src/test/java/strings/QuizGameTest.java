package strings;

import org.junit.Test;

import static org.junit.Assert.*;
import static strings.QuizGame.checkAnswer;

/**
 * Created by clara on 2/2/18.
 */
public class QuizGameTest {
    @Test
    public void checkAnswerTest() throws Exception {
        
        assertTrue("Return true if the answer is correct, ignoring case. Your method should return true for \"pants\"", checkAnswer("pants"));
        assertTrue("Return true if the answer is correct, ignoring case. Your method should return true for \"PaNtS\"", checkAnswer("PaNtS"));
        assertTrue("Return true if the answer is correct, ignoring case. Your method should return true for \"PANTS\"", checkAnswer("PANTS"));
        assertTrue("Return true if the answer is correct, ignoring case. Your method should return true for \"paNTS\"", checkAnswer("paNTS"));
    
    
        assertFalse("Return false if the answer is anything other than \"pants\" in any case. Your method should return false for \"squarepants\"", checkAnswer("squarepants"));
        assertFalse("Return false if the answer is anything other than \"pants\" in any case. Your method should return false for \"squirrels\"", checkAnswer("squirrels"));
        assertFalse("Return false if the answer is anything other than \"pants\" in any case. Your method should return false for \"pants   \" (notice spaces at the end of the String", checkAnswer("pants   "));
    
    
    }
    
}