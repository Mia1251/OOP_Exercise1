package se.lexicon;

import se.lexicon.model.Car;

public class App {
    public static void main(String[] args) {
        Car drive = new Car(1, 2010, "Skoda Fabia", "Silver", 77);
        System.out.println(drive.getModel() + " with motor " + drive.getMotorSize() + " can drive now.");
    }
}

