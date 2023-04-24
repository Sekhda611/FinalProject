package CaesarCipher;

public class CaesarCipher {
    private int shift;
     //Constructor that sets the shift value
    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }


    // Method that takes a String message and returns an encrypted version using Caesar Cipher
    public String encrypt(String message) {
        // Create a StringBuilder to build the encrypted message character by character
        StringBuilder result = new StringBuilder();
        // Iterate through each character in the message
        for (char c : message.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Get the base value of the character (either 'A' or 'a') depending on whether it's uppercase or lowercase
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Apply the shift value to the character's ASCII code to encrypt it
                c = (char) ((c - base + getShift()) % 26 + base);
            }
            // Append the character to the StringBuilder
            result.append(c);
        }
        // Return the encrypted message as a String
        return result.toString();
    }

    // Method that takes an encrypted message and returns the decrypted version using Caesar Cipher
    public String decrypt(String message) {
        // Create a StringBuilder to build the decrypted message character by character
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the message
        for (char c : message.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Get the base value of the character (either 'A' or 'a') depending on whether it's uppercase or lowercase
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Apply the negative shift value to the character's ASCII code to decrypt it
                c = (char) ((c - base - getShift() + 26) % 26 + base);
            }
            // Append the character to the StringBuilder
            result.append(c);
        }
        // Return the decrypted message as a String
        return result.toString();

    }
}
