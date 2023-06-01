package com.epam.basics.branching;

import com.epam.basics.util.ReaderUtil;

/**
 * 2. Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a: ");
        int b = ReaderUtil.readIntValue("Enter b: ");
        int c = ReaderUtil.readIntValue("Enter c: ");
        int d = ReaderUtil.readIntValue("Enter d: ");
        int max = maxValue(a, b, c, d);
        System.out.println("\nmax(min(a,b), min(c,d)) = " + max);
    }

    public static int maxValue(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}