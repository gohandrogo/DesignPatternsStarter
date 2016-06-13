package io.zipcoder.designpatterns.factory;

import io.zipcoder.designpatterns.factory.Beer.Beer;
import io.zipcoder.designpatterns.factory.Beer.BeerTap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class BeerDispenserSpec {

    BeerTap beerDispenser;

    @Before
    public void setUp() throws Exception {
        beerDispenser = new BeerTap();
    }

    @Test
    public void dispense() throws Exception {
        assertTrue(beerDispenser.dispense() instanceof Beer);
    }

}