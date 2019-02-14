package main.java.fung;

import main.java.fung.model.Cat;
import main.java.fung.model.Tiger;

public class Main {
    public static void main(String[] args) {
        Cat tiger = new Tiger(1.0, 50.0);
        tiger.act();
    }
}
