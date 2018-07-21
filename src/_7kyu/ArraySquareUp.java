package _7kyu;

/**
 * This is a question from codingbat
 *
 * Given an integer n greater than or equal to 0, create and return an array with the following pattern:
 *
 * squareUp(3) => [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * squareUp(2) => [0, 1, 2, 1]
 * squareUp(4) => [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 * n<=1000.
 */

public class ArraySquareUp {
    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int indent = n - 1;
        for (int i = 0, k = 0; i < arr.length; i++, k++) {
            if (k < n) {
                if (indent <= 0) {
                    arr[i] = n - k;
                }
            }
            indent--;
            if (arr[i] == 1) {
                indent = n - 1 - (i + 1) / n;
                k = -1;
            }
        }
        return arr;
    }
}
