package io.zipcoder.designpatterns.factory.Soda;

import io.zipcoder.designpatterns.factory.Super.Drink;

public class Soda implements Drink {
    public Soda(){
        System.out.println("Sweet, sugary soda.");
    }
}