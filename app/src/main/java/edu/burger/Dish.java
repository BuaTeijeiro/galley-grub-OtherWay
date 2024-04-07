package edu.burger;

public class Dish {
    String name;
    Double price;

    public Dish(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }
}
