package strings;

import static input.InputUtils.stringInput;

/**
 
 Finish the checkAnswer method. Compare the user's answer to the correct answer to this SpongeBob SquarePants quiz question.
 https://en.wikipedia.org/wiki/SpongeBob_SquarePants
 */

public class QuizGame {
    
    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        String input = stringInput("Who lives in a pineapple under the sea? SpongeBob Square____  ?");
        boolean correct = checkAnswer(input);

        if (correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, that's not right. Run the program again to try again. ");
        }
    }
    
    
    public static boolean checkAnswer(String userAnswer) {

        // TODO compare the userAnswer to the correctAnswer. Return a boolean representing if the two Strings have the same characters
        // The comparison should be case insensitive. So, "pants" and "PANTS" and "pAnTs" are all correct.
        
        String correctAnswer = "pants";
        
        // TODO replace this line with your answer.
        return false;
    }
    
}
