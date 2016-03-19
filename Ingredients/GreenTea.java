package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class GreenTea extends Ingredient {
    public GreenTea(int amount, double price){
        super("green tea", amount, price);
    }
    public GreenTea(int amount){
        this(amount, 0.0);
    }
}
