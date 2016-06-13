package io.zipcoder.designpatterns.factory.Coffee;

import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;

public class CoffeeMachine extends DrinkDispenser {
    public Coffee dispense(){
        return new Coffee();
    }
}
