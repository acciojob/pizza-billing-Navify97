package com.driver;

public class Pizza {
    private static final int VEG_BASE_PRICE = 300;
    private static final int NON_VEG_BASE_PRICE = 400;
    private static final int EXTRA_CHEESE_PRICE = 80;
    public static final int VEG_EXTRA_TOPPINGS_PRICE = 70;
    public static final int NONVEG_EXTRA_TOPPINGS_PRICE = 120;
    private static final int TAKEAWAY_PRICE = 20;

    public int price;
    private Boolean isVeg;
    public String bill;
    Boolean extraCheese;
    private Boolean extraToppings;
    private Boolean takeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        this.takeawayAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!this.extraCheese) { // check if extra cheese has already been added
            this.extraCheese = true; // mark extra cheese as added
            this.price += EXTRA_CHEESE_PRICE; // add extra cheese price to the pizza
            this.bill += "Extra Cheese Added: " + EXTRA_CHEESE_PRICE + "\n"; // add extra cheese to the bill
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!this.extraToppings) { // check if extra toppings have already been added
            this.extraToppings = true; // mark extra toppings as added
            if (this.isVeg) { // if the pizza is veg, add the veg extra toppings price
                this.price += VEG_EXTRA_TOPPINGS_PRICE; // add veg extra toppings price to the pizza
                this.bill += "Extra Toppings Added (Veg Pizza): " + VEG_EXTRA_TOPPINGS_PRICE + "\n"; // add extra toppings to the bill
            } else { // if the pizza is non-veg, add the non-veg extra toppings price
                this.price += NONVEG_EXTRA_TOPPINGS_PRICE; // add non-veg extra toppings price to the pizza
                this.bill += "Extra Toppings Added (Non-Veg Pizza): " + NONVEG_EXTRA_TOPPINGS_PRICE + "\n"; // add extra toppings to the bill
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!this.takeawayAdded) {
            this.price += TAKEAWAY_PRICE;
            this.bill += "Paperbag Added: " + TAKEAWAY_PRICE + "\n";
            this.takeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
