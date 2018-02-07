package arrays;

import java.util.Arrays;

/**
 * Created by clara on 2/2/18.
 */
public class FileCount {
    
    public static void main(String[] args) {
        
        String[] files = {"assignment.doc", "test.java", "report.xlsx", "week1.java", "fun.py", "form.pdf"};
        
        String extension = ".java";
        
        int programCodeFiles = countProgramCodeFiles(files, extension);
        
        System.out.println("There are " + programCodeFiles + " program code files in " + Arrays.toString(files));
        
    }
    
    
    public static int countProgramCodeFiles(String[] files, String extension) {
        
        //TODO count the number of files in the files array that end with the extension given.
        // Count only file names that end with the extension given.
        // Be case-sensitive. The files must end with an extension in the same case as the extension variable.
        // Replace this a line that returns the total number of files with this extension.
        
        return 0;

    }
}
