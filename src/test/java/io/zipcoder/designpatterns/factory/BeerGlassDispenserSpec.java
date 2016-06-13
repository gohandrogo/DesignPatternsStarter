package io.zipcoder.designpatterns.factory;

import io.zipcoder.designpatterns.factory.Beer.BeerGlass;
import io.zipcoder.designpatterns.factory.Beer.BeerGlassDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerGlassDispenserSpec {

    BeerGlassDispenser dispenser;

    @Before
    public void setUp() throws Exception {

        dispenser = new BeerGlassDispenser();

    }

    @Test
    public void dispense() throws Exception {
        boolean cond = dispenser.dispense() instanceof BeerGlass;
        assertTrue(cond);
    }

}