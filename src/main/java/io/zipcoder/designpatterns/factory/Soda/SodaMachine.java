package io.zipcoder.designpatterns.factory.Soda;


import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;

public class SodaMachine extends DrinkDispenser {
    public Soda dispense(){
        return new Soda();
    }
}