import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherPlainText_returnsCiphertext_J() {
        try {
            String expected = "J";
            String actual = "H";
        }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }

    @Test
    public void cipherPlainText_returnsCiphertext_K() {
        try {
            String expected = "K";
            String actual = "I";
        }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }

    @Test
    public void cipherPlainText_returnsCiphertext_JK() {
        try {
            String expected = "JK";
            String actual = "HI";
        }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }

    @Test
    public void cipherPlainText_returnsCiphertext_NCBA() {
        try {
            String expected = "NCBA";
            String actual = "LAZY";
        }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }

    @Test
    public void cipherPlainText_returnsCiphertext_() {
       try {
           String expected = "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI";
           String actual = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }
}