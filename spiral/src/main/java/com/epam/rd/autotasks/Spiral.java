package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];

        int currentNumber = 1;
        int maxNumbers = rows * columns;

        int rowTop = 0, rowBottom = rows - 1;
        int columnLeft = 0, columnRight = columns - 1;

        while (currentNumber <= maxNumbers) {
            for (int i = columnLeft; currentNumber <= maxNumbers && i <= columnRight; i++) {
                array[rowTop][i] = currentNumber++;
            }
            rowTop++;

            for (int i = rowTop; currentNumber <= maxNumbers && i <= rowBottom; i++) {
                array[i][columnRight] = currentNumber++;
            }
            columnRight--;

            for (int i = columnRight; currentNumber <= maxNumbers && i >= columnLeft; i--) {
                array[rowBottom][i] = currentNumber++;
            }
            rowBottom--;

            for (int i = rowBottom; currentNumber <= maxNumbers && i >= rowTop; i--) {
                array[i][columnLeft] = currentNumber++;
            }
            columnLeft++;
        }

        return array;
    }
}
