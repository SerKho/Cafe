package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Coffee extends Ingredient {
    public Coffee(int amount, double price){
        super("coffee", amount, price);
    }
    public Coffee(int amount){
        this(amount, 0.0);
    }
}
