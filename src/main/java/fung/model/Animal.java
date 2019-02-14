package main.java.fung.model;

public class Animal {
    private double age;
    private double weight;

    public Animal(double age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void run() {
        System.out.println("跑动");
    }

    public void eat() {
        System.out.println("吃东西");
    }
}
