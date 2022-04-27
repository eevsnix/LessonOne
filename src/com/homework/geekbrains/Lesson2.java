package com.homework.geekbrains;

public class Lesson2 {
   public static void main(String[] args) {
        positiveOrNegative(-3);
        printWordNTimes("Harry Potter", 5);

    }
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void positiveOrNegative (int a) {

        if (a >= 0) {
            System.out.println("Positive number " + a);
        } else if (a < 0) {
            System.out.println("Negative number " + a);
        }

    }
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++)
            System.out.println(word);

        }
    }

