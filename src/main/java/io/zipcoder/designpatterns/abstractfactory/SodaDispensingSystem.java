package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return new SodaDispenser();
    }

    @Override
    public CupDispenser cupDispenser() {
        return new SodaCupDispenser();
    }
}
