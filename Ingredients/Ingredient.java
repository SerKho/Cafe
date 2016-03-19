package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Ingredient {
    protected String name;
    protected int amount;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ingredient(String name, int amount, double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
}
