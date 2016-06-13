package io.zipcoder.designpatterns.factory.Coffee;


import io.zipcoder.designpatterns.factory.Super.Drink;

public class Coffee implements Drink {
    public Coffee() {
        System.out.println("Mmm, coffee.");
    }
}
