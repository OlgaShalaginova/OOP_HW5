package org.example.OOP.HW5;

import HW5.Model.Car;
import HW5.Model.CarShope;
import HW5.Presenter.Presenter;
import HW5.Presenter.PresenterService;
import HW5.View.View;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PresenterService prService = new PresenterService(new View());
        prService.start(prService);
    }
}