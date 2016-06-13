package io.zipcoder.designpatterns.factory.Soda;

import io.zipcoder.designpatterns.factory.Super.CupDispenser;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaCupDispenser extends CupDispenser {
    public SodaCup dispense(){ return new SodaCup();}
}
