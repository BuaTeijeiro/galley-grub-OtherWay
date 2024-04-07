package edu.burger;

import java.util.ArrayList;

public class Dish {
    String name;
    Double price;
    Double totalPrice;
    ArrayList<Extra> extras = new ArrayList<>();

    public Dish(String name, Double price) {
        this.name = name;
        this.price = price;
        this.totalPrice = price;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }

    Double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        System.out.println(this);
    }

    public void addExtra(Extra newExtra) {
        this.extras.add(newExtra);
        this.totalPrice += newExtra.getPrice();
    }

    int countExtras(){
        return this.extras.size();
    }

    @Override
    public String toString(){
        StringBuilder display = new StringBuilder(getName())
        .append("............")
        .append(getTotalPrice())
        .append("$\n")
        .append("\tBasic....")
        .append(getPrice())
        .append("$\n");
        for (Extra extra : this.extras){
            display.append("\t")
            .append(extra.toString())
            .append("\n");
        }
        return display.toString();
    }

    
}
