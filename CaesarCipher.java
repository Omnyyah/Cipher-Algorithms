import java.util.Scanner;

import static java.lang.System.out;

public class CaesarCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static Scanner in = new Scanner(System.in);

    public static String encryption(String msg, int shift) {
        return msg.toLowerCase()
                .codePoints()
                .mapToObj(c -> Character.isWhitespace(c) ? ' ' : ALPHABET.charAt((shift + ALPHABET.indexOf((char) c)) % 26))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    public static String decryption(String msg, int shift) {
        return msg.toLowerCase()
                .codePoints()
                .mapToObj(c -> {
                    if (Character.isWhitespace(c)) {
                        return ' ';
                    } else {
                        int keyVal = (ALPHABET.indexOf(c) - shift) % 26;
                        keyVal = keyVal < 0 ? ALPHABET.length() + keyVal : keyVal;
                        return ALPHABET.charAt(keyVal);
                    }
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    public static void main(String[] args) {
        out.println("if you want encryption press 1,if you want decryption press 2");
        int command = in.nextInt();
        in.nextLine();
        switch (command) {
            case 1:
                out.println("Please enter your message");
                final String msgToEencrypt = in.nextLine();
                out.println("Please enter your key");
                final int keyToEencrypt = in.nextInt();
                out.println(encryption(msgToEencrypt, keyToEencrypt));
                break;
            case 2:
                out.println("Please enter your message");
                final String msgToDecrypt = in.nextLine();
                out.println("Please enter your key");
                final int keyToDecrypt = in.nextInt();
                out.println(decryption(msgToDecrypt, keyToDecrypt));
                break;
        }

    }

}
