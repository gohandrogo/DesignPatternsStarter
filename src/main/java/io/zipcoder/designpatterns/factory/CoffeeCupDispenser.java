package io.zipcoder.designpatterns.factory;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {
    @Override
    public Cup dispense() {
        return new CoffeeCup();
    }
}
