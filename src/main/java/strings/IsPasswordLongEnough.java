package strings;

import static input.InputUtils.stringInput;

/**
 * Strings, if-statements
 */


public class IsPasswordLongEnough {
    
    public static void main(String[] args) {
        
        String password = stringInput("Enter your new password");
        if (isPasswordLongEnough(password)) {
            System.out.println("Your password is long enough");
        }
        
    }
    
    public static boolean isPasswordLongEnough(String password) {
        
        int minPasswordLength = 8;   // Use this variable in the comparison
        
        // TODO return true if the password String is 8 or more letters long
        // or, TODO return false if the password String is less than 8 letters.
        
        return false;  // todo replace this line with your code
    }
    
}
