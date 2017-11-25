import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Omniyyah
 */

public class VigenèreCipher {

    public static Scanner in = new Scanner(System.in);
    public static char[][] table = new char[26][26];

    public static void makeTable() {

        char ch = 'A';

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                int x = ((((int) ch - 65) + j) % 26) + 65;
                table[i][j] = (char) x;
            }

            ch++;
        }
    }

    public static void printTable() {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                out.print(table[i][j] + " ");
            }
        }
    }

    public static char getCharFromTable(int row, int col) {
        return table[row][col];
    }

    public static String encryption(String msg, String key) {
        String cipherText = "";
        msg = msg.toUpperCase().replaceAll(" ", "");
        key = key.toUpperCase().replaceAll(" ", "");

        int keyLength = key.length();

        for (int i = 0; i < msg.length(); i++) {

            int x = ((int) (msg.charAt(i)) - 65);
            int y = (((int) (key.charAt((i % keyLength)))) - 65);

            cipherText += getCharFromTable(x, y);

        }

        return cipherText;
    }

    public static String decryption(String msg, String key) {
        String plainText = "";
        msg = msg.toUpperCase().replaceAll(" ", "");
        key = key.toUpperCase().replaceAll(" ", "");
        int keyLength = key.length();

        for (int i = 0; i < msg.length(); i++)
        {
            int x = (((int) msg.charAt(i)) - 65);
            int y = (((int) (key.charAt((i % keyLength)))) - 65);

            char ch = msg.charAt(i);
            int j;
            for (j = 0; j < 26; j++) {
                if (getCharFromTable(y, j) == ch) {
                    break;
                }
            }

            plainText += getCharFromTable(0, j);
        }

        return plainText;
    }

    public static void main(String[] args) {
        makeTable();
        out.println("if you want encryption press 1,if you want decryption press 2");
        int command = in.nextInt();
        in.nextLine();
        switch (command) {
            case 1:
                out.println("Please enter your message");
                String msgToEencrypt = in.nextLine();
                out.println("Please enter your key");
                String keyToEencrypt = in.nextLine();
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
