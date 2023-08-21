package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        int amountOfStangers = new Scanner(System.in).nextInt();
        if (amountOfStangers > 0) {
            for (int i = 0; i < amountOfStangers; i++) {
                String strangerName = new Scanner(System.in).nextLine();
                System.out.println("Hello, " + strangerName);
            }
        }
        else if (amountOfStangers < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        else {
            System.out.println("Oh, it looks like there is no one here");
        }
    }
}
