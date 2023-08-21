package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] allStringNumbers = inputLine.split(" ");

        int numberOfPeople = Integer.parseInt(allStringNumbers[0]);
        int numberOfPiecesPerPizza = Integer.parseInt(allStringNumbers[1]);

        System.out.println(lcm(numberOfPeople, numberOfPiecesPerPizza) / numberOfPiecesPerPizza);
    }

    private static int gcd(int firstNumber, int secondNumber){
        return secondNumber == 0 ? firstNumber : gcd(secondNumber,firstNumber % secondNumber);
    }

    private static int lcm(int firstNumber, int secondNumber){
        return firstNumber / gcd(firstNumber,secondNumber) * secondNumber;
    }
}
