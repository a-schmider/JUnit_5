package org.junit.operations;

public class AdvancedOperations {
    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int power(int a, int b) {
        int result = 1;
        while (b-- > 0) {
            result *= a;
        }
        return result;
    }

}