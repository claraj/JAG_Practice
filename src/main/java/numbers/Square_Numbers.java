package numbers;

import static input.InputUtils.intInput;

/**
 *
 * Finish the method that squares a number, and returns the total.
 * Squaring a number means multiplying it by itself.
 *
 * So, the square of 4 is 4x4 = 16
 * The square of 10 is 10x10 = 100
 *
 */

public class Square_Numbers {

    public static void main(String[] args) {
        
        // You don't need to modify any of the code in the main method
        
        System.out.println("This program will square a number.");  // Print message for user
        int number = intInput("Please enter the number");   // Get user input
        
        int total = square(number);   // Call the square method
        
        // Print the output, using String formatting
        System.out.println(String.format("The result of squaring %d makes %s", number, total));

    }

    public static int square(int num) {
    
    
        // TODO write your code here, and replace the return 0; statement with a return statement for squared value
        
        return 0;

    }

}
