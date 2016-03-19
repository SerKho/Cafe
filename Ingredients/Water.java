package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Water extends Ingredient {
    public Water(int amount, double price){
        super("water", amount, price);
    }

    public Water(int amount){
        this(amount, 0.0);
    }
}
