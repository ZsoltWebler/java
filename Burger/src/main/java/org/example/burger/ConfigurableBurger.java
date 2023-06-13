package org.example.burger;

import java.util.ArrayList;
import java.util.List;

public abstract class ConfigurableBurger<T extends Topping> extends Burger<T> {

    private List<T> extraToppings;
    private int maxToppingCount;

    public ConfigurableBurger(String name, MeatType meatType, BreadType breadType, double price, int maxToppingCount) {
        super(name, meatType, breadType, price);
        this.extraToppings = new ArrayList<>();
        this.maxToppingCount = maxToppingCount;
    }

    public void addExtraTopping(T topping) {
        if (this.extraToppings.size() < maxToppingCount) {
            this.extraToppings.add(topping);
        }
    }

    public void removeExtraTopping(T topping) {
        this.extraToppings.remove(topping);
    }

    @Override
    public List<T> getToppings() {
        return this.extraToppings;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + extraToppings.stream().mapToDouble(T::getPrice).sum();
    }
}
