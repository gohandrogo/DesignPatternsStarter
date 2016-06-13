package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.Beer.BeerTap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerDispenserSystemSpec {

    BeerDispenserSystem beerDispenserSystem;

    @Before
    public void setUp() throws Exception {
        beerDispenserSystem = new BeerDispenserSystem();
    }

    @Test
    public void drinkDispenser() throws Exception {
        assertTrue(beerDispenserSystem.drinkDispenser() instanceof BeerTap);
    }

    @Test
    public void cupDispenser() throws Exception {

    }

}