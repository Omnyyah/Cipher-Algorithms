
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author Manoo
 */
public class AffineCipher{
    
    public static void encryption(String msg,int a,int b)
    {
        StringBuilder c=new StringBuilder();
        msg=msg.toLowerCase();
        for (int i = 0; i < msg.length(); i++)
        {
            char character = msg.charAt(i);
            
        if(character == ' ')
            {
                c.append(" ");
            }
        else
           {
          
        if (Character.isLetter(character)) 
             {
            
            character = (char) ((a * (character - 'a') + b) % 26 + 'a');
             }
           }
            c.append(character);
       }
        
        System.out.println(c.toString().toUpperCase());
    }
    
    
 public static void decryption(String msg,int a,int b)
    {
        
    msg=msg.toLowerCase();
    StringBuilder p = new StringBuilder();
    BigInteger inverse = BigInteger.valueOf(a).modInverse(BigInteger.valueOf(26));
    for (int in = 0; in < msg.length(); in++) 
    {
        char character = input.charAt(in);
        if(character == ' ')
            {
                c.append(" ");
            }
        else (Character.isLetter(character))
        {
            int decoded = inverse.intValue() * (character - 'a' - b + 26);
            character = (char) (decoded % 26 + 'a');
        }
        p.append(character);
    }
   System.out.println(p.toString().toUpperCase());
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
        System.out.println("Please enter a and b values");
        System.out.print("a = ");
        int a=in.nextInt();
        in.nextLine();
        System.out.print("b = ");
        int b=in.nextInt();
        
        encryption(msg,a,b);
            
        }
        if(n==2)
        {
        System.out.println("Please enter your message");
        String msg=in.nextLine();
       System.out.println("Please enter a and b values");
        System.out.print("a = ");
        int a=in.nextInt();
        in.nextLine();
        System.out.print("b = ");
        int b=in.nextInt();
        
        decryption(msg,a,b);
        
        }
    
    }
    
}
