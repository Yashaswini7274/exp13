package com.bnmit;

public class App {

    // Method to test
    public static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int result = findGreatest(5, 9, 3);
        System.out.println("Greatest number is: " + result);
    }
}