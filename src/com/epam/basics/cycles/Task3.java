package com.epam.basics.cycles;

/**
 * 3. Найти сумму квадратов первых ста чисел
 */
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}