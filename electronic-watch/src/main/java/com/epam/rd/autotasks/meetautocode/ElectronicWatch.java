package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();
        int hours = timeInSeconds / 3600 % 24;
        int minutes = timeInSeconds / 60 % 60;
        int seconds = timeInSeconds % 60;
        System.out.println(hours + ":" + ConvertToString(minutes) + ":" + ConvertToString(seconds));
    }

    private static String ConvertToString(int time) {
        return time < 10 ? "0" + time : "" + time;
    }
}
