package variables_loops_if_statments;

import java.util.Random;

import static input.InputUtils.stringInput;

/**
 * Finish this Rock Paper Scissors game.
 */


public class RockPaperScissors {
    
    public static final String ROCK = "R";
    public static final String PAPER = "P";
    public static final String SCISSORS = "S";
    
    public static final String USER = "User";
    public static final String COMPUTER = "Computer";
    public static final String TIE = "It's a tie!";
    
    
    public static void main(String[] args) {
    
        String computerChoice = computerChoose();
        
        String userChoice;
        
        do {
            System.out.println("Enter R for rock, P for paper, S for scissors...");
            userChoice = stringInput(".... go!").toUpperCase();
        } while (!(userChoice.equals(ROCK) || userChoice.equals(PAPER) || userChoice.equals(SCISSORS)));
        
        
        String winner = determineWinner(userChoice, computerChoice);
    
        System.out.printf("%s chose %s and %s chose %s\n", USER, userChoice, COMPUTER, computerChoice);
        
        if (winner.equals(TIE)) {
            System.out.println("It's a tie!");
        } else {
            System.out.printf("%s is the winner!\n", winner);
        }
    
    }
    
    public static String determineWinner(String userChoice, String computerChoice) {
        
        // TODO Figure out the winner, and return the name of the winner - USER or COMPUTER or TIE
        // Use one of the global constants for the return value.
        return "replace this with your code";
     
        // TODO try to avoid 9 if-statements. Think about how to solve this without nine if statements?
    }
    
    
    // You don't need to modify this method.
    private static String computerChoose() {
        Random rnd = new Random();
        int random = rnd.nextInt(3);
        
        if (random == 0)        return ROCK;
        else if (random == 1)   return PAPER;
        else                    return SCISSORS;       // todo optional - what do you think of this style? pros and cons?
        
    }
    
}
