import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_J(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'J';
        assertEquals(expected, messageCipher.cipherLetter('H'));
    }

    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_K(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'K';
        assertEquals(expected, messageCipher.cipherLetter('I'));
    }

    @Test
    public void cipherWord_returnsCipherWord_JK(){
        MessageCipher messageCipher = new MessageCipher();
        String expected = "JK";
        assertEquals(expected, messageCipher.cipherWord("HI"));
    }
}
