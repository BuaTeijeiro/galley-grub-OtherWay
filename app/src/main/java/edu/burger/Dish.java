package edu.burger;

import java.util.ArrayList;

public class Dish {
    String name;
    Double price;
    ArrayList<Extra> extras = new ArrayList<>();

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

    public void display() {
        System.out.println(this);
    }

    public void addExtra(Extra newExtra) {
        this.extras.add(newExtra);
    }

    int countExtras(){
        return this.extras.size();
    }

    @Override
    public String toString(){
        StringBuilder display = new StringBuilder(getName())
        .append("............")
        .append(getPrice())
        .append("$");
        return display.toString();
    }

    
}
