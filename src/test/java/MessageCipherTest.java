import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_J() {
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'J';
        assertEquals(expected, messageCipher.cipherLetter('H'));
    }

    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_K() {
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'K';
        assertEquals(expected, messageCipher.cipherLetter('I'));
    }

    @Test
    public void cipherWord_returnsCipherWord_JK() {
        MessageCipher messageCipher = new MessageCipher();
        String expected = "JK";
        assertEquals(expected, messageCipher.cipherWord("HI"));
    }

    @Test
    public void cipherWord_returnsCipherWord_NCBA() {
        MessageCipher messageCipher = new MessageCipher();
        String expected = "NCBA";
        assertEquals(expected, messageCipher.cipherWord("LAZY"));
    }

    @Test
    public void cipherPlainText_returnsCiphertext_() {
       try {
           String expected = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
           String actual = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       }
        catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());}
    }
}