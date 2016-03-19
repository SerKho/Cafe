package Cafe.Products;

import Cafe.Ingredients.*;

/**
 * Created by 777 on 19.03.2016.
 */
public class Capucinno extends BlackCoffee {

    public Capucinno(){}

    public Capucinno(IngredientPriceList i){
        this(i,200, 15, 15, 200);
    }
    public Capucinno(IngredientPriceList i, int waterAmount, int sugarAmount, int coffeeAmount, int milkFoamAmount){
//        super(i,waterAmount, sugarAmount, coffeeAmount);
        this.i = i;
        ingredients[0] = new Water(waterAmount);
        ingredients[1] = new Sugar(sugarAmount);
        ingredients[2] = new Coffee(coffeeAmount);
        ingredients[3] = new MilkFoam(milkFoamAmount);
        name = "Capucinno";
        this.price = Math.rint(100.0 * countPrice()) / 100.0;
    }

    @Override
    public double countPrice() {
        return super.countPrice() +
                ingredients[3].getAmount()/i.getIPList()[3].getAmount()*i.getIPList()[3].getPrice();
    }
}
