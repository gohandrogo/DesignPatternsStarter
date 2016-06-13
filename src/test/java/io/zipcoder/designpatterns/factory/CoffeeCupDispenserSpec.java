package io.zipcoder.designpatterns.factory;

import io.zipcoder.designpatterns.factory.Coffee.CoffeeCup;
import io.zipcoder.designpatterns.factory.Coffee.CoffeeCupDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class CoffeeCupDispenserSpec {

    CoffeeCupDispenser dispenser;

    @Before
    public void setUp() throws Exception {
        dispenser = new CoffeeCupDispenser();
    }

    @Test
    public void dispense() throws Exception {
        assertTrue(dispenser.dispense() instanceof CoffeeCup);
    }

}