package com.epam.basics.branching;

import com.epam.basics.util.ReaderUtil;

/**
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = ReaderUtil.readIntValue("Enter a side of hole A:");
        int b = ReaderUtil.readIntValue("Enter a side of hole B:");
        int x = ReaderUtil.readIntValue("Enter a side of brick x:");
        int y = ReaderUtil.readIntValue("Enter a side of brick y:");
        int z = ReaderUtil.readIntValue("Enter a side of brick z:");
        boolean result = isBrickPassed(a, b, x, y, z);
        System.out.println(result ? "The brick is passed " : "The brick is not passed");

    }

    public static boolean isBrickPassed(int a, int b, int x, int y, int z) {
        return a >= x && b >= y
                || a >= y && b >= x
                || a >= x && b >= z
                || a >= z && b >= x
                || a >= y && b >= z
                || a >= z && b >= y;
    }
}