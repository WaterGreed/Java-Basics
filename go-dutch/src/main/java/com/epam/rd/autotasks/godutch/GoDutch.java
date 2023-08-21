package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int billTotalAmount = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();

        if (billTotalAmount >= 0 && numberOfFriends > 0) {
            int payableAmount = (int)(billTotalAmount * 1.1);
            int payableAmountForeachFriend = payableAmount / numberOfFriends;
            System.out.println(payableAmountForeachFriend);
        }
        else {
            if (billTotalAmount < 0) {
                System.out.println("Bill total amount cannot be negative");
            }

            if (numberOfFriends <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
            }
        }
    }
}
