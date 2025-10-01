package com.mycompany.mavenproject;

public class MavenProject {

    public static void main(String[] args) {
        System.out.println("Hello from Maven Project!");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("10 - 4 = " + subtract(10, 4));
    }

    // A simple add method for testing
    public static int add(int a, int b) {
        return a + b;
    }

    // A simple subtract method for testing
    public static int subtract(int a, int b) {
        return a - b;
    }

    // A simple method to check even numbers
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
