package com.bridge.SnakeLadder;

public class SnakeLadder {

    public static void main(String[] args) {
        int Start_Position = 0;

        int Dice_Number = (int) (Math.random() * 6 + 1);

        System.out.println(" Position of Player is :" + Start_Position);
        System.out.println(" Player got the number is :" + Dice_Number);
    }
}
