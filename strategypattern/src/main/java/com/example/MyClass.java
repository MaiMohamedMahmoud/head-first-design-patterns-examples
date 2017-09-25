package com.example;

/**
 * Created by mai on 9/25/17.
 */

public class MyClass {
    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");
        Duck duck = new MallardDuck();
        duck.display();
        duck.PerformFly();
        duck.performquack();
    }
}
