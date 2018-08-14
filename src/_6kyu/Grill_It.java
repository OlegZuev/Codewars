package _6kyu;

/**
 * Introduction
 * A grille cipher was a technique for encrypting a plaintext by writing it onto a sheet of paper through a pierced sheet (of paper or cardboard or similar). The earliest known description is due to the polymath Girolamo Cardano in 1550. His proposal was for a rectangular stencil allowing single letters, syllables, or words to be written, then later read, through its various apertures. The written fragments of the plaintext could be further disguised by filling the gaps between the fragments with anodyne words or letters. This variant is also an example of steganography, as are many of the grille ciphers. Wikipedia Link
 *
 * Tangiers1 Tangiers2
 *
 * Task
 * Write a function that accepts two inputs: message and code and returns hidden message decrypted from message using the code.
 * The code is a nonnegative integer and it decrypts in binary the message.
 *
 * grille("abcdef", 5)  => "df"
 *
 * message : abcdef
 * code    : 000101
 * ----------------
 * result  : df
 */

public class Grill_It {
    public static String grille(String message, int code) {
        if (message.length() == 0) {
            return message;
        }

        char[] arrCode;
        int offset = 0;
        if (message.length() > Integer.toBinaryString(code).length()) {
            arrCode = String.format("%"+ message.length() +"s", Integer.toBinaryString(code)).toCharArray();
        } else {
            arrCode = Integer.toBinaryString(code).toCharArray();
            offset = arrCode.length - message.length();
        }

        StringBuilder newMessage = new StringBuilder();
        for (int i = offset; i < arrCode.length; i++) {
            if (arrCode[i] == '1') {
                newMessage.append(message.charAt(i - offset));
            }
        }
        return newMessage.toString();
    }
}
