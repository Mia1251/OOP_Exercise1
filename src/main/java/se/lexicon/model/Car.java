package se.lexicon.model;

public class Car {

    private int id;
    private int year;
    private String model;
    private String colour;
    private int motorSize;

    public Car(int id, int year, String model, String colour, int motorSize){
        this.id = id;
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.motorSize = motorSize;
    }
    public void drive(String model, int motorSize) {
        System.out.println(model + " with motor " + motorSize + " can drive now.");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int  getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }
}

