package main.java.fung.model;

public class Cat extends Animal{
    public Cat(double age, double weight) {
        super(age, weight);
    }

    public void act() {
        System.out.println("喵喵叫");
    }
}
