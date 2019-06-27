package com.yourname.favoritedrinks;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Soda", "A sweet, carbonated beverage",
                    R.drawable.soda),
            new Drink("Smoothie", "Your choice of fruit blended with yogurt",
                    R.drawable.smoothie),
            new Drink("Coffee", "Locally roasted from Fair Trade beans",
                    R.drawable.coffee)
    };

    // Each Drink has a name, description and image resource
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
