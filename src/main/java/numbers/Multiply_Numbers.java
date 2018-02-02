package numbers;

import static input.InputUtils.intInput;

/**
 *
 * Finish the method that multiplies two numbers, and returns the total.
 *
 */

public class Multiply_Numbers {

    public static void main(String[] args) {
        
        // You don't need to modify any of the code in the main method
        
        System.out.println("This program will multiply two numbers.");
        int number1 = intInput("Please enter the first number");
        int number2 = intInput("Please enter the second number");
        
        int total = multiplyNumbers(number1, number2);
        
        // Print the output, using String formatting
        System.out.println(String.format("The result of multiplying %d and %d makes %s", number1, number2, total));

    }

    public static int multiplyNumbers(int num1, int num2) {
    
        // This method should multiply the num1 and num2 variables, and return the result.
        // For example, if num1 = 5 and num2 = 3, your code should calculate 5 * 3 = 15
    
        // TODO write your code here, and replace this return 0; statement with a return statement for multiplied value
        
        return 0;

    }

}
