package arrays;

import org.junit.Test;

import static arrays.FileCount.countProgramCodeFiles;
import static org.junit.Assert.*;

/**
 * Created by clara on 2/7/18.
 */
public class FileCountTest {
    @Test
    public void testCountProgramCodeFiles() throws Exception {
        
        String[] testFiles = {"assignment.doc", "test.java", "report.xlsx", "week1.java", "fun.py", "form.pdf", "report2.doc", "report3.doc"};
    
        String extension = ".java";
    
        assertEquals(2, countProgramCodeFiles(testFiles, extension));
        
        extension = ".doc";
    
        assertEquals(3, countProgramCodeFiles(testFiles, extension));
    
        extension = ".cpp";
    
        assertEquals(0, countProgramCodeFiles(testFiles, extension));
    
    
    }
    
}