package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class TeaWithBergamot extends Ingredient {
    public TeaWithBergamot(int amount, double price){
        super("tea with bergamot", amount, price);
    }
    public TeaWithBergamot(int amount){
        this(amount, 0.0);
    }
}
