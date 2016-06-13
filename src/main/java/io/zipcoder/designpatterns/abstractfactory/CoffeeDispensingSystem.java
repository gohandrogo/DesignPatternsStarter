package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.*;



class CoffeeDispensingSystem extends DispensingSystem{
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }
}
