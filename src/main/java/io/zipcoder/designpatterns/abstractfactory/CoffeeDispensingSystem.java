package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.Coffee.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.Coffee.CoffeeMachine;
import io.zipcoder.designpatterns.factory.Super.CupDispenser;
import io.zipcoder.designpatterns.factory.Super.DrinkDispenser;


class CoffeeDispensingSystem extends DispensingSystem{
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }
    public CupDispenser cupDispenser(){
        return CoffeeCupDispenser.getInstance();
    }
}
