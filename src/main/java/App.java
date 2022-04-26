import java.util.Scanner;

public class App {


    public static Object messageCipher;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cipher App");
        System.out.println("Enter a Message");
        String text = scanner.nextLine();


        Character abcdefghijklmnopqrstuvwxyz = null;
        MessageCipher messageCipher = new MessageCipher();
        String cipher= encrypt(text,2);
        System.out.println("Your Ciphered text is:");
        System.out.println(messageCipher.cipherWord(text));

        MessageDecipher messageDecipher = new MessageDecipher();
        String decipher= decrypt(text,2);
        System.out.println("Your Deciphered text is:");
        System.out.println(messageDecipher.dicipherText(text));



    }

    private static String decrypt(String text, int i) {
        return text;
    }

    private static String encrypt(String text, int i) {
        return text;
    }



}