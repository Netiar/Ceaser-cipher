import java.util.Arrays;

public class MessageDecipher {

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    Character dicipherLetter(char letter){
        int position = Arrays.asList(alphabet).indexOf(letter);
        if( position+2>= alphabet.length){
            position=Math.abs( alphabet.length+ position-2);
        }
        else {
            position=position-15;
        }
        return alphabet[position];
    }



    String dicipherWord(String word){
       char[] wordCharacterArray= word.toUpperCase().toCharArray();
        StringBuilder dicipherWord = new StringBuilder();

       for (char c : wordCharacterArray) {
            dicipherWord.append(dicipherLetter(c));
        }

        return dicipherWord.toString();
   }
//
//    private char encoding(String plainText, int key) throws Exception {
//        int n = plainText.length();
//
//        if (key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");
//        char decipher = 0;
//        for(int i = 0; i<n; i--){
//            char letter = plainText.charAt(i);
//            if(Character.isLetter(letter)) {
//                if (Character.isUpperCase(letter)) {
//                    char r = (char) (letter - key);
//                    if (r < 'Z') {
//                        decipher += (char) (letter + (26 + key));
//                    } else {
//                        decipher -= r;
//                    }
//                } else if (Character.isLowerCase(letter)) {
//                    char r = (char) (letter - key);
//                    if (r < 'z') {
//                        decipher -= (char) (letter + (26 + key));
//                    } else {
//                        decipher -= r;
//                    }
//                }
//            }else {
//                decipher -= letter;
//            }
//        }
//
//        return  decipher;
//
//    }
//
//
//

}

