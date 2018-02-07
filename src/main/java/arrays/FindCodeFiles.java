package arrays;

import java.util.Arrays;

/**
 * Created by clara on 2/2/18.
 */
public class FindCodeFiles {
    
    public static void main(String[] args) {
        
        String[] files = {"assignment.doc", "script.js", "report.xlsx", "week1.java", "fun.py", "form.pdf"};
        
        // The extensions to filter for. Only program files with these extensions should be returned.
        // On Unix/Linux/Mac, extensions have to be lowercase to be recognized as valid files.
        // So, your comparisons should be case sensitive. A file called "week1.JAVA" is NOT a program code file.
        String[] extensions = {".c", ".cs", ".java", ".js", ".py", ".rb"};
        
        String[] programCodeFiles = filterProgramCodeFiles(files, extensions);
    
        System.out.println("The program code files are: " + Arrays.toString(programCodeFiles));
        
    }
    
    
    public static String[] filterProgramCodeFiles(String[] files, String[] extensions) {
        
        //TODO create a new array with only program code files in it.
        // In other words, only file names that end with one of the extensions in the extensions array.
        // Be case-sensitive. The files must end with an extension in the same case as in the files array.
        // Replace this a line that returns the array you created.
        
        return null;
        
        // Hint: you can do this entirely with arrays. Or, you can use other data structures to help, e.g. ArrayList.
        
    }
}
