package com.example;

public abstract class Duck {
    flyBehaviour flyb;
    quackBehaviour quackb;
    public Duck()
    {

    }
    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, can swim");
    }

    public void PerformFly(){
        flyb.fly();
    }

    public void performquack(){
        quackb.quack();
    }


}
