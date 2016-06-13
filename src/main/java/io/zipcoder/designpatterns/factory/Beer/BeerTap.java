package io.zipcoder.designpatterns.factory.Beer;

import io.zipcoder.designpatterns.factory.Super.Drink;
import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerTap extends DrinkDispenser {
    @Override
    public Drink dispense() {
        return new Beer();
    }
}
