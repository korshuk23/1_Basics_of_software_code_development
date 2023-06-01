package com.epam.basics.cycles;

import com.epam.basics.util.ReaderUtil;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int firstNumber = ReaderUtil.readIntValue("Enter first number");
        int secondNumber = ReaderUtil.readIntValue("Enter second number");
        includedDigits(firstNumber, secondNumber);
    }

    //version 1
    private static void includedDigits(int numb1, int numb2) {
        int temp1;
        int temp2;
        while (numb1 > 0) {
            temp1 = numb1 % 10;
            numb1 /= 10;
            temp2 = numb2;
            while (temp2 > 0) {
                if (temp2 % 10 == temp1) {
                    System.out.print(" (" + temp1 + ") ");
                }
                temp2 /= 10;
            }
        }
        System.out.println();
    }

    //version 2
    private static void includedDigits2(int numb1, int numb2) {
        String a = Integer.toString(numb1);
        String b = Integer.toString(numb2);
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.printf("(%s)", b.charAt(j));
                }
            }
        }
    }
}
