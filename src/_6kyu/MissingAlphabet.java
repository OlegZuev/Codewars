package _6kyu;

/**
 * In this Kata you have to create a function,named insertMissingLetters,that takes in a string and outputs the same string processed in a particular way.
 *
 * The function should insert only after the first occurence of each character of the input string, all the alphabet letters that:
 *
 * -are NOT in the original string
 * -come after the letter of the string you are processing
 *
 * Each added letter should be in uppercase, the letters of the original string will always be in lowercase.
 *
 * Example:
 *
 * input: "holly"
 *
 * missing letters: "a,b,c,d,e,f,g,i,j,k,m,n,p,q,r,s,t,u,v,w,x,z"
 *
 * output: "hIJKMNPQRSTUVWXZoPQRSTUVWXZlMNPQRSTUVWXZlyZ"
 *
 * You don't need to validate input, the input string will always contain a certain amount of lowercase letters (min 1 / max 50).
 */

public class MissingAlphabet {
    public static String insertMissingLetters(String str) {
        int[] alphabet = new int[500];
        StringBuilder line = new StringBuilder();
        for (char c : str.toUpperCase().toCharArray()) {
            if (alphabet[c] == 1) {
                line.append(Character.toLowerCase(c));
                continue;
            }
            line.append(Character.toLowerCase(c));
            for (int i = c + 1; i <= 'Z'; i++) {
                if (!str.contains(Character.toLowerCase((char) i) + "")) {
                    line.append((char) i);
                }
            }
            alphabet[c] = 1;
        }
        return line.toString();
    }
}
