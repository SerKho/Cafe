package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Chocolate extends Ingredient {
    public Chocolate(int amount, double price){
        super("chocolate", amount, price);
    }
    public Chocolate(int amount){
        this(amount, 0.0);
    }
}
