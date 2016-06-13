package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispensingSystemSpec {

    SodaDispensingSystem System;

    @Before
    public void setUp() throws Exception {
        System = new SodaDispensingSystem();
    }

    @Test
    public void drinkDispenserTest() throws Exception {
        assertTrue(System.drinkDispenser() instanceof Soda);
    }

    @Test
    public void cupDispenserTest() throws Exception {

    }

}