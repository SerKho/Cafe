package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class Sugar extends Ingredient {
    public Sugar(int amount, double price){
        super("sugar", amount, price);
    }
    public Sugar(int amount){
        this(amount, 0.0);
    }
}
