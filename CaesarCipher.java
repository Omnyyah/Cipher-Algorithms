import java.util.Scanner;

public class CaesarCipher
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void encryption(String msg,int shift)
    {
        msg=msg.toLowerCase();
        String cipher= "";
        
        for(int i=0;i<msg.length();i++)
        {
            if(msg.charAt(i) == ' ')
            {
                cipher+=" ";
            }
            else
            {
            int charPosition = ALPHABET.indexOf(msg.charAt(i));
            int keyVal = (shift + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipher += replaceVal;
            }
            
        }
        
        System.out.println(cipher); 
        
    }
    
    
    public static void decryption(String msg,int shift)
    {
        msg = msg.toLowerCase();
        String plainText = "";
        for (int i = 0; i < msg.length(); i++)
        {
             if(msg.charAt(i) == ' ')
            {
                plainText+=" ";
            }
            else
            {
            int charPosition = ALPHABET.indexOf(msg.charAt(i));
            int keyVal = (charPosition - shift) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        }
        
         System.out.println(plainText); 
    }
    
    
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("if you want encryption press 1,if you want decryption press 2");
        int n=in.nextInt();
        in.nextLine();
        if(n==1)
        {
            System.out.println("Please enter your message");
        String msg=in.nextLine();
        System.out.println("Please enter your key");
        int k=in.nextInt();
        
        encryption(msg,k);
            
        }
        if(n==2)
        {
        System.out.println("Please enter your message");
        String msg=in.nextLine();
        System.out.println("Please enter your key");
        int k=in.nextInt();
        decryption(msg,k);
        
        }
    }
    
}
