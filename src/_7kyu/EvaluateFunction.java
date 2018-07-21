package _7kyu;

/**
 * Hello,
 *
 * I am Jomo Pipi
 *
 * and today we will be evaluating an expression like this:
 *
 * (there are an infinite number of radicals)
 *
 * \LARGE \sqrt{x+\sqrt{x+\sqrt{x+\sqrt{x...}}}}
 *
 * for a given value x
 */

public class EvaluateFunction {
    public static double evaluateFunction(int x) {
        return 0.5 + Math.sqrt(0.25 + x);
    }
}