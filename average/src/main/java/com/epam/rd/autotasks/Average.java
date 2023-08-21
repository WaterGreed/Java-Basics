package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        String inputLine = scanner.nextLine();
        String[] allStringNumbers = inputLine.split(" ");

        int sum = 0;

        for (int i = 0; i < allStringNumbers.length - 1; i++) { //ноль не учитываем
            sum += Integer.parseInt(allStringNumbers[i]);
        }

        int average = sum / (allStringNumbers.length - 1); //ноль не учитываем
        System.out.println(average);
    }

}