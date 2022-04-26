
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageDecipherTest {

    @Test
    public void dicipherPlainText_returnsCharDicipherText_() {
        MessageDecipher messageDecipher = new MessageDecipher();
        try {
            String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
            String actual = "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI";
        }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}

    }
}

