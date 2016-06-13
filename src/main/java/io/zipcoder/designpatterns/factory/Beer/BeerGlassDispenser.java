package io.zipcoder.designpatterns.factory.Beer;

import io.zipcoder.designpatterns.factory.Super.Cup;
import io.zipcoder.designpatterns.factory.Super.CupDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerGlassDispenser extends CupDispenser {
    @Override
    public Cup dispense() {
        return new BeerGlass();
    }
}
