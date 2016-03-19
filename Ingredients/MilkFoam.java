package Cafe.Ingredients;

/**
 * Created by 777 on 18.03.2016.
 */
public class MilkFoam extends Ingredient {
    public MilkFoam(int amount, double price){
        super("milk foam", amount, price);
    }
    public MilkFoam(int amount){
        this(amount, 0.0);
    }
}
