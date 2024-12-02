package com.example.baidemospringioc;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving...");
        engine.start();
    }
}
