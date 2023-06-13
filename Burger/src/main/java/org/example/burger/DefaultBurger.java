package org.example.burger;

public class DefaultBurger extends ConfigurableBurger<DefaultTopping> {

    private static final int MAX_TOPPING_COUNT = 4;

    public DefaultBurger(String name, MeatType meatType, BreadType breadType, double price) {
        super(name, meatType, breadType, price, MAX_TOPPING_COUNT);
    }
}
