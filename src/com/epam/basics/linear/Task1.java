package com.epam.basics.linear;

import com.epam.basics.util.ReaderUtil;

/**
 * 1. Найдите значение функции: z = ((a – 3) * b / 2) + c.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a ");
        int b = ReaderUtil.readIntValue("Enter b ");
        int c = ReaderUtil.readIntValue("Enter c ");
        double result = findValueOfExpression(a, b, c);
        System.out.println("Z = " + result);
    }

    private static double findValueOfExpression(int a, int b, int c) {
        return ((a - 3) * b / 2.0) + c;
    }
}
