package org.example.burger;

public class HealthyBurger extends ConfigurableBurger<HealthyTopping> {
    private static final int MAX_TOPPING_COUNT = 3;
    private static final BreadType HEALTHY_BURGER_BREAD_TYPE = BreadType.WHOLE_GRAIN;

    public HealthyBurger(String name, MeatType meatType, double price) {
        super(name, meatType, HEALTHY_BURGER_BREAD_TYPE, price, MAX_TOPPING_COUNT);
    }
}
