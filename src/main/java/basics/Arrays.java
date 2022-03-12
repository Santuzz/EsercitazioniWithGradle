package basics;

/**
 * You can find many more here:
 * https://www.w3resource.com/java-exercises/array/index.php
 *
 * Preferences -> Editor -> General -> Code folding -> One-line methods (uncheck)
 * Code -> Folding -> Collapse All
 * Code -> Folding -> Expand Doc Comments
 */
public class Arrays {
    /**
     * Write a function accepting a double[] and a factor f (double)
     * returning a double[] representing the original double[] divided by f
     */
    public static double[] divideArray(double[] in, double f) {
        int len = in.length;
        double[] out = new double[len];
        for (int i = 0; i < len; i++) {
            out[i] = in[i] / f;
        }
        return out;
    }

    /**
     * Write a function accepting two double[]
     * returning a double[] representing the first array divided by the second array
     * The two arrays must have the same size. Returns null otherwise.
     */
    public static double[] divideArrays(double[] a, double[] b) {
        double[] out = new double[a.length];
        for (int i = 0; i < out.length; i++) {
            out[i] = a[i] / b[i];
        }
        return out;
    }

    /**
     * Write a function accepting an int[]
     * returning a sorted version of it (bubble sort)
     */
    static int[] bubbleSort(int[] v) {
        int len = v.length;
        boolean finito = false;
        while (!finito) {
            finito = true;
            for(int i = 0; i<len-1;i++) {
                if(v[i] > v[i + 1]){
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                    finito = false;
                }
            }
        }
        return v;
    }

    /**
     * Write a function accepting an int
     * returning a long[] composed of the first n numbers of the Fibonacci series (without recursion).
     */
    public static long[] fibonacci(int n) {
        long[] fibo = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibo[0] = 0;
            } else if (i == 1) {
                fibo[1] = 1;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
        }
        return fibo;
    }

    /**
     * Write a function accepting an int[]
     * returning an int[] in which all the 0s have been moved to the end of an array.
     * Maintain the relative order of the other (non-zero) elements.
     */
    public static int[] moveZerosEnd(int[] v) {
        int len = v.length;
        int s = 0, f = len - 1;
        int[] out = new int[len];
        for (int i : v) {
            if (i == 0) {
                out[f] = i;
                f--;
            } else {
                out[s] = i;
                s++;
            }
        }
        return out;
    }

    /**
     * Write a function accepting an int
     * returning the sequence of individual digits.
     * (e.g. 363738229 -> [3,6,3,7,3,8,2,2,9])
     */
    public static int[] splitter(int input) {
        int len = 0;
        int div = input;
        while (div != 0) {
            len++;
            div /= 10;
        }
        int[] out = new int[len];
        for (int i = len-1; i >= 0; i--) {

            out[i] = input % 10;
            input /= 10;
        }
        return out;
    }

}