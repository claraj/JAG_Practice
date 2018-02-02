package arrays;

import org.junit.Test;

import static arrays.FindCodeFiles.filterProgramCodeFiles;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/2/18.
 */
public class FindCodeFilesTest {
    @Test
    public void filterProgramCodeFilesTest() throws Exception {
    
    
        String[] files = {"assignment.doc", "script.js", "report.xlsx", "week1.java", "fun.py", "form.pdf"};
        String[] extensions = {".c", ".cs", ".java", ".js", ".py", ".rb"};
    
        String[] expected = {"script.js", "week1.java", "fun.py"};
        assertArrayEquals("Return an array with only the program files in it.", expected, filterProgramCodeFiles(files, extensions));
        
    }
    
    
    
    @Test
    public void filterProgramCodeFilesTestAgain() throws Exception {
        
        String[] files = {"assignment.doc", "script.js", "report.xlsx", "fun.py", "form.pdf", "math.cpp"};
        String[] extensions = {".c", ".cs", ".cpp", ".js", ".py", ".rb"};   // No java! Added .cpp
        
        String[] expected = {"script.js", "fun.py", "math.cpp"};
        assertArrayEquals("Return an array with only the program files in it.", expected, filterProgramCodeFiles(files, extensions));
        
    }
    
    
    
    
    @Test
    public void filterProgramCodeFilesTestVerifyAtEnd() throws Exception {
        
        String[] files = {"assign.rb.ment.doc", "script.js.doc", "report.xlsxrb", "week1.java", "fun.py", "form.pdf"};
        String[] extensions = {".c", ".cs", ".java", ".js", ".py", ".rb"};
        
        String[] expected = {"week1.java", "fun.py"};
        assertArrayEquals("Return an array with only the program files - the ones with the extensions in the extensions array - in it.", expected, filterProgramCodeFiles(files, extensions));
        
    }
    
}