/**
 * @class CaesarCipher
 * @author Sonal Sekhda
 * @course ITEC 2140 secton 04
 * @date April 22, 2023
 */
package CaesarCipher;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input form the user
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a message
        System.out.print("Enter a String : ");
        // Read the user's message and store it in String variable
        String message = input.nextLine();
        //Prompt the user to enter 'E' to encrypt or 'D' to decrypt
        System.out.print("Enter a E for Encrypt or D for Decrypt the String: ");
        // Read the user's operation input and store it in a String variable
        String c = input.next();

        // Prompt the user to enter an integer key value for encryption or decryption
        System.out.println("Enter a number to shift Encrypt or Decrypt: ");
        // Read the user's key input and store it in an int variable
        int key = input.nextInt();
        input.nextLine();

        // Create a CaesarCipher object with the given key
        CaesarCipher cipher = new CaesarCipher(key);

        // Create a String variable to store the result of the encryption or decryption
        String result = "";
        // If the operation is 'E', call the encrypt method of the CaesarCipher object
        if (c.equalsIgnoreCase("E")) {
            result = cipher.encrypt(message);
            System.out.print("Encrypted result is: " + result);
        }
        // If the operation is 'D', call the decrypt method of the CaesarCipher object
        else if (c.equalsIgnoreCase("D")) {
            result = cipher.decrypt(message);
            System.out.println("Decrypted message: " + result);
        }
        // If the operation is not 'E' or 'D', print an error message
        else {
            System.out.println("Invalid operation");

        }
    }
}
