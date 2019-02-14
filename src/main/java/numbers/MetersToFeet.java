package numbers;


import static input.InputUtils.doubleInput;


/**
 
 Finish the metersToFeet method.
 This method should use the meters variable, and convert it to the equivalent number of feet.
 
 */

public class MetersToFeet {
    
    public static void main(String[] args) {
    
        // You don't need to modify any of the code in the main method
        
        // Ask for a number of meters
        double meters = doubleInput("Please enter a number of meters:");
        // Use the metersToFeet method to convert this value to feet
        double feet = metersToFeet(meters);
        // And print the value in feet
        System.out.println(meters + " meters is equivalent to " + feet + " feet");
    }

    public static double metersToFeet(double numberOfMeters) {
        
        // TODO convert the value of the variable meters to feet. Assume 1 meter = 3.28 feet
        
        // TODO replace this line with a line that returns the number of feet you calculated
        return 0;
        
    }
}
