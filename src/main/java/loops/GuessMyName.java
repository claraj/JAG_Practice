package loops;

import static input.InputUtils.stringInput;

public class GuessMyName {

    public static void main(String[] args) {

        String computerName = "Cody";

        System.out.println("Guess my name!");

        String guess = stringInput("Guess my name!");

        if ( guess.equals(computerName) ) {
            System.out.println("Wrong!");
        }

        // TODO print a different message if the user guessed the computer name correctly.


    }



}
