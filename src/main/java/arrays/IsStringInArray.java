package arrays;

import static input.InputUtils.stringInput;

/**
 * Created by clara on 2/8/18.
 */
public class IsStringInArray {
    
    public static void main(String[] args) {
        
        String[] languages = {"Java", "Python", "C#", "JavaScript"};
        String searchLanguage = stringInput("Enter a programming language to search for: ");
        if (languageInArray(searchLanguage, languages)) {
            System.out.println(searchLanguage + " is in the array");
        } else {
            System.out.println(searchLanguage + " is not in the array");
        }
        
    }
    
    public static boolean languageInArray(String searchLanguage, String[] languages) {
        // if the exact string searchLanguage is in the languages array, return true
        // otherwise, return false.
        
        // for the example searchLanguage = "Python" and languages = {"Java", "Python", "C#", "JavaScript"}, return true
        // for the example searchLanguage = "Swift" and languages = {"Java", "Python", "C#", "JavaScript"}, return false
        
        // Your search should be case insensitive, so
    
        // for the example searchLanguage = "PYTHON" and languages = {"Java", "Python", "C#", "JavaScript"}, return true
        // for the example searchLanguage = "jAvA" and languages = {"Java", "Python", "C#", "JavaScript"}, return true
        // for the example searchLanguage = "swift" and languages = {"Java", "Python", "C#", "JavaScript"}, return false
    
        
        return false; // todo replace with your code
        
    }
    
}
