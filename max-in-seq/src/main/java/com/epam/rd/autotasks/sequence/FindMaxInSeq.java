package com.epam.rd.autotasks.sequence;

import java.util.Scanner;

public class FindMaxInSeq {

    public static int max() {
        // Put your code here

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] allStringNumbers = inputLine.split(" ");

        int maxNumber = Integer.parseInt(allStringNumbers[0]); //вначале максимальное число самое первое

        for (int i = 0; i < allStringNumbers.length - 1; i++) { //ноль не учитываем
            int currentNumber = Integer.parseInt(allStringNumbers[i]);
            if (currentNumber > maxNumber){
                maxNumber = currentNumber;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}
