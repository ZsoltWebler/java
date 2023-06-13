package org.example.burger;

import java.util.List;

public class PremiumBurger extends Burger<DefaultTopping> {

    private static final String PREMIUM_BURGER_NAME = "Premium Burger";
    private static final MeatType PREMIUM_BURGER_MEAT_TYPE = MeatType.PREMIUM;
    private static final BreadType PREMIUM_BURGER_BREAD_TYPE = BreadType.PREMIUM;
    private static final double PREMIUM_BURGER_PRICE = 0.0;


    private List<DefaultTopping> extraToppings;

    public PremiumBurger() {
        super(PREMIUM_BURGER_NAME, PREMIUM_BURGER_MEAT_TYPE, PREMIUM_BURGER_BREAD_TYPE, PREMIUM_BURGER_PRICE);
        this.extraToppings = List.of(
                new DefaultTopping("SAJT", 500),
                new DefaultTopping("BACON", 500),
                new DefaultTopping("HAGYMA", 500),
                new DefaultTopping("EXTRA_HÚS", 500),
                new DefaultTopping("SALÁTA", 500),
                new DefaultTopping("KETCHUP", 500)
        );
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (extraToppings.stream().mapToDouble(DefaultTopping::getPrice).sum() * 1.5);
    }

    @Override
    public List<DefaultTopping> getToppings() {
        return this.extraToppings;
    }
}
