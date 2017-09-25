package com.example;

/**
 * Created by mai on 9/25/17.
 */

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyb  = new FlyWithWings();
        quackb = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}
