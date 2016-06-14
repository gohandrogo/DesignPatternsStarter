package io.zipcoder.designpatterns.factory.Coffee;

import io.zipcoder.designpatterns.factory.Super.Cup;
import io.zipcoder.designpatterns.factory.Super.CupDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class CoffeeCupDispenser extends CupDispenser {

    private static CoffeeCupDispenser instance;

    private CoffeeCupDispenser(){}

    @Override
    public Cup dispense() {
        return new CoffeeCup();
    }

    public static CoffeeCupDispenser getInstance(){
        if(null == instance) instance = new CoffeeCupDispenser();
        return instance;
    }
}
