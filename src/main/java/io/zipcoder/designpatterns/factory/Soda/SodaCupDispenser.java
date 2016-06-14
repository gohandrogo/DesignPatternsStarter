package io.zipcoder.designpatterns.factory.Soda;

import io.zipcoder.designpatterns.factory.Super.CupDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaCupDispenser extends CupDispenser {

    private static SodaCupDispenser instance;

    private SodaCupDispenser(){};

    @Override
    public SodaCup dispense(){ return new SodaCup();}

    public static SodaCupDispenser getInstance(){
        if(null==instance) instance = new SodaCupDispenser();
        return instance;
    }
}
