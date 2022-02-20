package com.epam.jwd.task1.view;

import com.epam.jwd.task1.model.entity.Car;

import java.util.List;

/**
 * Class for print information on console
 * It has overloading method for one
 * string information and list objects that
 * must look friendly
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class Printer {

    /**
     * Allow any type information output in console
     *
     * @param message our information that we want to
     *                show in console
     * @param <T> type our message for example value
     *           of calculation or simple string
     *           information
     */
    public static <T>void PrintInConsole(T message) {
        System.out.println(message);
    }

    /**
     * Convert list cars from one string information
     * to many strings information
     *
     * @param taxis list cars for friendly output
     *              in console
     */
    public static void PrintInConsole(List<Car> taxis) {
        String str = "";

        for (Car car : taxis) {
            str += car.toString() + "\n";
        }

        System.out.println(str);
    }
}
