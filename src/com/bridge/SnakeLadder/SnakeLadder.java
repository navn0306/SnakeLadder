package com.bridge.SnakeLadder;

public class SnakeLadder {

    public static final int Start_Position = 0;
    public static final int Winning_Position = 100;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static int currentPosition = 0;

    public static void main(String[] args) {

        while (currentPosition < Winning_Position) {

            int Dice_Number = (int) (Math.random() * 6 + 1);
            int option = (int) ((Math.random() * 10 % 3) + 1);

            if (option == IS_SNAKE) {
                currentPosition -= Dice_Number;
                if (currentPosition < 0) {
                    currentPosition = Start_Position;
                }
                System.out.println("IS_SNAKE : " + currentPosition);
            } else if (option == IS_LADDER) {
                if (currentPosition + Dice_Number <= 100) {
                    currentPosition += Dice_Number;
                } else {
                    System.out.println("No Play");
                }
                System.out.println("IS_LADDER : " + currentPosition);
            } else {
                System.out.println("No Play");
            }


        }
    }
}