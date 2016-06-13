package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return null;
    }

    @Override
    public CupDispenser cupDispenser() {
        return null;
    }
}
