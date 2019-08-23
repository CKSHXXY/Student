package com.xxy.guess;

import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<6; i++) {
            System.out.print("Please input a number:");
            int number = scanner.nextInt();
            System.out.println(number);
        }
    }
}
