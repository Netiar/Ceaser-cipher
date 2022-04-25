
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageDecipherTest {
    @Test
    public void cipherLetter_returnsCharMinusTwoPosition_J() {
        MessageDecipher messageDecipher = new MessageDecipher();
        Character expected = 'J';
        assertEquals(expected, messageDecipher.dicipherLetter('H'));
    }

    @Test
    public void cipherLetter_returnsCharMinusTwoPosition_k() {
        MessageDecipher messageDecipher = new MessageDecipher();
        Character expected = 'K';
        assertEquals(expected, messageDecipher.dicipherLetter('I'));
    }

    @Test
    public void dicipherWord_returnsCharDicipherWord_JK() {
        MessageDecipher messageDecipher = new MessageDecipher();
        String expected = "JK";
        assertEquals(expected, messageDecipher.dicipherWord("HI"));
    }

    @Test
    public void dicipherWord_returnsCharDicipherWord_NCBA() {
        MessageDecipher messageDecipher = new MessageDecipher();
        String expected = "NCBA";
        assertEquals(expected, messageDecipher.dicipherWord("LAZY"));
    }
}

