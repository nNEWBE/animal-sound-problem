package org.example;

public abstract class Fish extends Animal implements Swimmable {
    protected Fish(double weight) {
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Fish breath");
    }

    public abstract void layEggs();

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}
