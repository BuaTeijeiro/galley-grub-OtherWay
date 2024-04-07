package edu.burger;

import java.util.ArrayList;

public class Order {
    ArrayList<Dish> dishes = new ArrayList<>();
    Double total = 0.0;

    public Order(){

    }

    public void addDish(Dish newDish){
        this.dishes.add(newDish);
        this.total += newDish.getTotalPrice();
    }

    public Double getTotal(){
        return this.total;
    }

    public void display(){
        System.out.println(this);
    }

    public String toString(){
        StringBuilder display = new StringBuilder();
        for (Dish dish : dishes){
            display.append(dish.toString());
        }
        return display.append("___________________________\nTotal\t\t")
        .append(getTotal())
        .append("$")
        .toString();
    }

}
