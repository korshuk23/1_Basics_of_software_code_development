package com.epam.basics.linear;

import com.epam.basics.util.ReaderUtil;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */
public class Task2 {
    public static void main(String[] args) {
        double a = ReaderUtil.readDoubleValue("Enter a ");
        double b = ReaderUtil.readDoubleValue("Enter b ");
        double c = ReaderUtil.readDoubleValue("Enter c ");
        double result = findValueOfExpression(a, b, c);
        System.out.println("F = " + result);
    }

    private static double findValueOfExpression(double a, double b, double c) {
        double temp = Math.sqrt(b * b + 4 * a * c);
        double result = 0;
        if (temp >= 0 && a > 0) {
            result = ((b + temp) / 2 * a) - a * a * a * c + Math.pow(b, -2);
        } else {
            throw new RuntimeException("Error! 'a' shouldn't be equal 0 and root value shouldn't be negative");
        }
        return result;
    }

}
