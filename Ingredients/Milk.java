package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Milk extends Ingredient {
    public Milk(int amount, double price){
        super("milk", amount, price);

    }

    public Milk(int amount){
        this(amount, 0.0);
    }
}
