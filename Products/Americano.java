package Cafe.Products;

import Cafe.Ingredients.*;

/**
 * Created by 777 on 19.03.2016.
 */
public class Americano extends CoffeeWithMilk {

    public Americano(IngredientPriceList i){
        this(i,200, 30, 15, 400);
    }
    public Americano(IngredientPriceList i, int waterAmount, int sugarAmount, int coffeeAmount, int milkAmount){
//        super(i,waterAmount,sugarAmount,coffeeAmount,milkAmount);
        this.i = i;
        ingredients[0] = new Water(waterAmount);
        ingredients[1] = new Sugar(sugarAmount);
        ingredients[2] = new Coffee(coffeeAmount);
        ingredients[3] = new Milk(milkAmount);
        name = "Americano";
        this.price = Math.rint(100.0 * countPrice()) / 100.0;
    }

    @Override
    public double countPrice() {
        return super.countPrice();
    }
}
