package strings;

import org.junit.Test;

import static org.junit.Assert.*;
import static strings.Whisper.whisper;

/**
 * Created by clara on 2/2/18.
 */
public class Whisper_Test {
    @Test
    public void whisperTest() throws Exception {
        
        assertEquals("Calling whisper with \"HELLO\" should return \"hello\"", "hello", whisper("Hello"));
    
        assertEquals("Calling whisper with \"Hello World\" should return \"hello world\"", "hello world", whisper("Hello World"));
    
        assertEquals("Calling whisper with \"C# Programming\" should return \"c# programming\"", "c# programming", whisper("C# Programming"));
    
    
    }
    
}