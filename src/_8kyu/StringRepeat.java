package _8kyu;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return String.valueOf(sb);
    }
}