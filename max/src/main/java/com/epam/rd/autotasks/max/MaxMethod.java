package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxValue = values[0]; //допустим, что первый элемент массива максимальный
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
