package org.example.OOP.HW5.Model;

public class Car {
    private String marka;
    private String model;
    private int num;

    public Car(String marka, String model, int num) {
        this.marka = marka;
        this.model = model;
        this.num = num;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", num=" + num +
                '}';
    }
}