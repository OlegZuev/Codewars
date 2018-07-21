package _7kyu;

/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, and u as vowels for this Kata.
 *
 * The input string will only consist of lower case letters and/or spaces.
 */

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        while (str.matches(".*[aeiou].*")) {
            str = str.replaceFirst("[aeiou]", "");
            vowelsCount++;
        }
        return vowelsCount;
    }
}
