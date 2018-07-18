/*
    Given the triangle of consecutive odd numbers:

                 1
              3     5
           7     9    11
       13    15    17    19
    21    23    25    27    29
    ...
    Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

    rowSumOddNumbers(1); // 1
    rowSumOddNumbers(2); // 3 + 5 = 8
 */

public class RowSumOddNumbers {
    /*
     * Велосипед, до озарения.
     */
    public static int rowSumOddNumbersOld(int n) {
        int start = n * (n - 1) / 2;
        int end = n * (n + 1) / 2;
        int counter = 1;
        for (int i = 0; i < start; i++) {
            counter = counter + 2;
        }
        int counterSum = 0;
        for (int i = start; i < end; i++) {
            counterSum = counterSum + counter;
            counter = counter + 2;
        }
        return counterSum;
    }

    /*
     * Очень логичная и забавная функция.
     */

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(4));
    }
}
