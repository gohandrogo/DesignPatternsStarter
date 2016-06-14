package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.Soda.*;
import io.zipcoder.designpatterns.factory.Super.*;


/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return new SodaMachine();
    }

    @Override
    public CupDispenser cupDispenser() {
        return SodaCupDispenser.getInstance();
    }
}
