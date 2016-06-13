package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;
import io.zipcoder.designpatterns.factory.Super.CupDispenser;

public abstract class DispensingSystem{
    public abstract DrinkDispenser drinkDispenser();
    public abstract CupDispenser cupDispenser();
}