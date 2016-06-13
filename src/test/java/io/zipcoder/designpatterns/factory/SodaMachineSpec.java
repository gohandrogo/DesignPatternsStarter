package io.zipcoder.designpatterns.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 6/13/16.
 */
public class SodaMachineSpec {

    SodaMachine sodaMachine;

    @Before
    public void setUp() throws Exception {
        sodaMachine = new SodaMachine();
    }

    @Test
    public void dispense() throws Exception {
        boolean cond = sodaMachine.dispense() instanceof  Soda;
        assertTrue(cond);
    }

}