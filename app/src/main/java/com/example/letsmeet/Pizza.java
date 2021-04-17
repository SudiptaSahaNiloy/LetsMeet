package com.example.letsmeet;

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Beef Pizza", R.drawable.beef_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza),
            new Pizza("Cheddar Pizza", R.drawable.cheddar_pizza)
    };
    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
