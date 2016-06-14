package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.Beer.BeerTap;
import io.zipcoder.designpatterns.factory.Beer.BeerGlassDispenser;
import io.zipcoder.designpatterns.factory.Super.CupDispenser;
import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerDispenserSystem extends DispensingSystem {

    @Override
    public DrinkDispenser drinkDispenser() {
        return new BeerTap();
    }

    @Override
    public CupDispenser cupDispenser() {
        return BeerGlassDispenser.getInstance();
    }
}
