package org.example.OOP.HW5.Presenter;

import HW5.Model.Car;
import HW5.Model.CarShope;
import HW5.View.View;

import java.util.Scanner;

public class Presenter {
    protected View view;
    protected Car car;
    protected CarShope carShope;

    public Presenter(View view) {
        this.view = view;
        this.carShope = new CarShope(5);
    }
    public View getView() {
        return view;
    }
    public Car getCar() {
        return car;
    }
    public CarShope getCarShope() {
        return carShope;
    }

}