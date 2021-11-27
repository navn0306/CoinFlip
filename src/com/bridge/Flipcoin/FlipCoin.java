package com.bridge.Flipcoin;

import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum;
        Scanner in = new Scanner(System.in);

        System.out.println("How many times will the coin be flipped? ");
        int flips = in.nextInt();

        while (counter <= flips) {
            randNum = Math.random();

            if (randNum < 0.5) {
                heads++;
            } else {
                tails++;
            }
            counter++;
        }
        System.out.println();
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);

        double headsPercentage = (heads * 100) / flips;
        double tailsPercentage = (tails * 100) / flips;

        System.out.println("Heads Percentage " + headsPercentage);
        System.out.println("Tails Percentage " + tailsPercentage);


    }
}
