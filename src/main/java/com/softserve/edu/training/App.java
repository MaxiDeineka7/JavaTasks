package com.softserve.edu.training;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input number of row.");
        int height = in.nextInt();
        System.out.println("Please, input number of column.");
        int widht = in.nextInt();

        int sum = printStar(height, widht);

        System.out.println("Good Bye! Total stars:" + sum);
    }

    public static int printStar(int height, int widht){
        int sum = height*widht;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= widht; j++) {
                if (i % 2 == 0){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        return sum;
    }
}
