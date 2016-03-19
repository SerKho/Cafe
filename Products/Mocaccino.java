package Cafe.Products;

import Cafe.Ingredients.*;

/**
 * Created by 777 on 19.03.2016.
 */
public class Mocaccino extends Capucinno {
    public Mocaccino(IngredientPriceList i){
        this(i,200, 15, 15, 200, 200);
    }
    public Mocaccino(IngredientPriceList i, int waterAmount, int sugarAmount, int coffeeAmount, int milkFoamAmount,
                     int chocolateAmount){
//        super(i,waterAmount, sugarAmount,coffeeAmount, milkFoamAmount);
        this.i = i;
        ingredients[0] = new Water(waterAmount);
        ingredients[1] = new Sugar(sugarAmount);
        ingredients[2] = new Coffee(coffeeAmount);
        ingredients[3] = new MilkFoam(milkFoamAmount);
        ingredients[4] = new Chocolate(chocolateAmount);
        name = "Mocaccino";
        this.price = Math.rint(100.0 * countPrice()) / 100.0;
    }

    @Override
    public double countPrice() {
        return super.countPrice() +
                ingredients[4].getAmount()/i.getIPList()[7].getAmount()*i.getIPList()[7].getPrice();
    }
}
