package io.zipcoder.designpatterns.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaDispenserSpec {

    SodaDispenser sodaDispenser;

    @Before
    public void setUp() throws Exception {
        sodaDispenser = new SodaDispenser();
    }

    @Test
    public void dispense() throws Exception {
        assertTrue(sodaDispenser.dispense() instanceof Soda);
    }

}