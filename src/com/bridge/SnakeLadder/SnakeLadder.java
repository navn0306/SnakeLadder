package com.bridge.SnakeLadder;

public class SnakeLadder {

    public static final int Start_Position = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;

    public static void main(String[] args) {

        int currentPostion = 0;
        int Dice_Number = (int) (Math.random() * 6 + 1);
        int option = (int) ((Math.random() * 10 % 3) + 1);

        if (option == IS_SNAKE) {
            currentPostion -= IS_SNAKE;
        } else if (option == IS_LADDER) {
            currentPostion += Dice_Number;
        } else {
            System.out.println("No Play");
        }
        System.out.println("Curretn Position : " +currentPostion);

    }
}
