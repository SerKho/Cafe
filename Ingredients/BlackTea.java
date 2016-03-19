package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class BlackTea extends Ingredient {
    public BlackTea(int amount, double price){
        super("black tea", amount, price);
    }
    public BlackTea(int amount){
        this(amount, 0.0);
    }

}
