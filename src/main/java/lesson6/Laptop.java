package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Laptop {
    private String brand;
    private String model;
    private String color;
    private int ramSize;
    private double screenSize;

    public Laptop(String brand, String model, String color, int ramSize, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ramSize=" + ramSize +
                ", screenSize=" + screenSize +
                '}';
    }
}

