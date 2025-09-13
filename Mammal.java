package org.example;

public abstract class Mammal extends Animal implements Walkable {
    protected Mammal(double weight) {
        super(weight);
    }

    @Override
    public void breathe() {
        System.out.println("Mammal breath");
    }

    public abstract void growHair();

    @Override
    public void walk() {
        System.out.println("Mammal is walking...");
    }
}
