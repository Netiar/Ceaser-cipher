
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageDecipherTest {
    @Test
    public void cipherLetter_returnsCharMinusTwoPosition_H() {
        MessageDecipher messageDecipher = new MessageDecipher();
        Character expected = 'H';
        assertEquals(expected, messageDecipher.dicipherLetter('J'));
    }

    @Test
    public void cipherLetter_returnsCharMinusTwoPosition_I() {
        MessageDecipher messageDecipher = new MessageDecipher();
        Character expected = 'I';
        assertEquals(expected, messageDecipher.dicipherLetter('K'));
    }

    @Test
    public void dicipherWord_returnsCharDicipherWord_HI() throws Exception {
        MessageDecipher messageDecipher = new MessageDecipher();
        String expected = "HI";
        assertEquals(expected, messageDecipher.dicipherWord("JK"));
    }

    @Test
    public void dicipherWord_returnsCharDicipherWord_BROWN() {
        MessageDecipher messageDecipher = new MessageDecipher();
        String expected = "BROWN";
        try {
            assertEquals(expected, messageDecipher.dicipherWord("DTQYP"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void dicipherPlainText_returnsCharDicipherText_() {
        MessageDecipher messageDecipher = new MessageDecipher();
        String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String  actual= "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI";
        try {
            assertEquals(expected, messageDecipher.dicipherPlainText(""));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

