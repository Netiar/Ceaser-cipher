import java.util.Arrays;

public class MessageCipher {

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    Character cipherLetter(char letter){
        int position = Arrays.asList(alphabet).indexOf(letter);
        if( position+2>= alphabet.length){
            position=Math.abs( alphabet.length- position-2);
        }
        else {
            position=position+2;
        }
        return alphabet[position];
    }

    public String cipherWord(String word){
        char[] wordCharacterArray= word.toUpperCase().toCharArray();
        StringBuilder cipherWord = new StringBuilder();

        for (char c : wordCharacterArray) {
            cipherWord.append(cipherLetter(c));
        }

        return cipherWord.toString();
    }

}





