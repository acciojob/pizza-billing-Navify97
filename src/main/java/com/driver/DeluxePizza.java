package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.extraCheese = true;
        if (isVeg) {
            this.price += VEG_EXTRA_TOPPINGS_PRICE;
            this.bill += "Extra Toppings Added (Veg Pizza): " + VEG_EXTRA_TOPPINGS_PRICE + "\n";
        } else {
            this.price += NONVEG_EXTRA_TOPPINGS_PRICE;
            this.bill += "Extra Toppings Added (Non-Veg Pizza): " + NONVEG_EXTRA_TOPPINGS_PRICE + "\n";
        }
    }
}
