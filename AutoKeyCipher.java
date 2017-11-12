import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Omniyyah
 */
public class AutoKeyCipher {

    public static Scanner in = new Scanner(System.in);

    private static String encryption(String plainText, String keyPhrase) {
        String cipherText = "";
        plainText = plainText.toUpperCase();
        keyPhrase = keyPhrase.toUpperCase();

        for (int i = 0; i < plainText.length(); i++) {
            int x = (((plainText.charAt(i) - 'A') + (keyPhrase.charAt(i) - 'A')) % 26);
            cipherText += (char) (x + 'A');
        }

        return cipherText;

    }

    private static String decryption(String cipherText, String keyPhrase) {
        String plainText = "";
        cipherText = cipherText.toUpperCase();
        keyPhrase = keyPhrase.toUpperCase();

        for (int i = 0; i < cipherText.length(); i++) {

            int x = (((cipherText.charAt(i) - 'A') - (keyPhrase.charAt(i) - 'A')) % 26);
            x = (x < 0) ? (26 - Math.abs(x)) : x;
            plainText += (char) (x + 'A');
            keyPhrase += (char) (x + 'A');
        }

        return plainText;
    }

    public static void main(String[] args) {
        out.println("if you want encryption press 1,if you want decryption press 2");
        int command = in.nextInt();
        in.nextLine();
        switch (command) {
            case 1:
                out.println("Please enter your message");
                String msgToEencrypt = in.nextLine().replaceAll(" ", "");

                out.println("Please enter your key");
                String keyToEencrypt = in.nextLine().replaceAll(" ", "");

                keyToEencrypt += msgToEencrypt;
                out.println(encryption(msgToEencrypt, keyToEencrypt));
                break;
                
            case 2:
                out.println("Please enter your message");
                String msgToDecrypt = in.nextLine();
                out.println("Please enter your key");
                String keyToDecrypt = in.nextLine();
                out.println(decryption(msgToDecrypt, keyToDecrypt));
                break;
        }

    }

}
