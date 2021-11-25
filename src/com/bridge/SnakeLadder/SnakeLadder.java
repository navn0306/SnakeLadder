package com.bridge.SnakeLadder;

public class SnakeLadder {

    public static void main(String[] args) {
        int position = 0 ;
        int Min = 1, Max = 6;

        double number =  Min + (int)(Math.random() * (( Max - Min) + 1));

        System.out.println(" Position of Player is :" +position);
        System.out.println(" Player got the number is :" +number);
    }
}
