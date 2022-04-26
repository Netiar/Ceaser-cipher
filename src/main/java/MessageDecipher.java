public class MessageDecipher {

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private static String decrypt (String plainText, int shift ){
        if (shift>26){
            shift=shift%26;
        }
        else if (shift<0){
            shift=(shift%26)+26;
        }

        String decipherText="";
        int length= plainText.length();
        for(int i=0; i<length; i++ ){
            char ch= plainText.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c= (char)(ch-shift);
                    if (c<'a'){
                        decipherText += (char)(ch + (26-shift));
                    }
                    else {
                        decipherText += c;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char c= (char)(ch-shift);
                    if (c<'A'){
                        decipherText += (char)(ch + (26-shift));
                    }
                    else {
                        decipherText += c;
                    }
                }
            }
            else {
                decipherText += ch;
            }
        }
        return decipherText;



    }

    public String dicipherText(String jumps) {
        return jumps ;
    }
}

