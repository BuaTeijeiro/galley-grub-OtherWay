package edu.burger;

public class Extra {
    String name;
    Double price;

    public Extra(String name, Double price) {
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

    @Override
    public String toString(){
        StringBuilder display = new StringBuilder(getName())
        .append("....")
        .append(getPrice())
        .append("$");
        return display.toString();
    }
}
