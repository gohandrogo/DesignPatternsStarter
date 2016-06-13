package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.SodaCup;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispensingSystemSpec {

    SodaDispensingSystem DispSystem;

    @Before
    public void setUp() throws Exception {
        DispSystem = new SodaDispensingSystem();
    }

    @Test
    public void drinkDispenserTest() throws Exception {
        assertTrue(DispSystem.drinkDispenser() instanceof SodaDispenser);
    }

    @Test
    public void cupDispenserTest() throws Exception {
        assertTrue(DispSystem.cupDispenser() instanceof SodaCupDispenser);
    }

}