package org.example.burger;

import java.util.List;

public abstract class Burger<T extends Topping> {

    private String name;
    private MeatType meatType;
    private BreadType breadType;
    private double price;

    public abstract List<T> getToppings();

    public Burger(String name, MeatType meatType, BreadType breadType, double price) {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }
}
