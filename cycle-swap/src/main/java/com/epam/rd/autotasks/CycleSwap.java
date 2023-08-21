package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        cycleSwap(array, 1);
    }

    static void cycleSwap(int[] array, int shift) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = copiedArray[(array.length + i - shift) % array.length];
        }
    }
}
