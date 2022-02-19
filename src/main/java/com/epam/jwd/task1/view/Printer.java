package com.epam.jwd.task1.view;

import com.epam.jwd.task1.model.entity.Car;

import java.util.List;

public class Printer {
    public static <T>void PrintInConsole(T message) {
        System.out.println(message);
    }

    public static void PrintInConsole(List<Car> taxis) {
        String str = "";
        for (Car car : taxis) {
            str += car.toString() + "\n";
        }
        System.out.println(str);
    }
}
