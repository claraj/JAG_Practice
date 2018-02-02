package ifstatements;

import org.junit.Test;

import static org.junit.Assert.*;
import static ifstatements.RockPaperScissors.*;

/**
 * Created by clara on 2/2/18.
 */
public class RockPaperScissorsTest {
    @Test
    public void determineWinnerComputerWin() throws Exception {
        
        assertEquals(COMPUTER, determineWinner(ROCK, PAPER));
        assertEquals(COMPUTER, determineWinner(PAPER, SCISSORS));
        assertEquals(COMPUTER, determineWinner(SCISSORS, ROCK));
        
    }
    
    
    @Test
    public void determineWinnerUserWin() throws Exception {
        
        assertEquals(USER, determineWinner(PAPER, ROCK));
        assertEquals(USER, determineWinner(SCISSORS, PAPER));
        assertEquals(USER, determineWinner(ROCK, SCISSORS));
    }
    
    
    
    @Test
    public void determineWinnerTie() throws Exception {
        
        assertEquals(TIE, determineWinner(ROCK, ROCK));
        assertEquals(TIE, determineWinner(PAPER, PAPER));
        assertEquals(TIE, determineWinner(SCISSORS, SCISSORS));
        
    }
    
    
}