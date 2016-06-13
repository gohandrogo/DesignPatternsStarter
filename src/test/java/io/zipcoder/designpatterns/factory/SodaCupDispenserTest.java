package io.zipcoder.designpatterns.factory;

import io.zipcoder.designpatterns.factory.Soda.SodaCup;
import io.zipcoder.designpatterns.factory.Soda.SodaCupDispenser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaCupDispenserTest {


    SodaCupDispenser dispenser;

    @Before
    public void setUp() throws Exception {

        dispenser = new SodaCupDispenser();

    }

    @Test
    public void dispense() throws Exception {

        boolean condition = dispenser.dispense() instanceof SodaCup;
        assertTrue(condition);

    }

}