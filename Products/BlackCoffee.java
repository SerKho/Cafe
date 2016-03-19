package Cafe.Products;

import Cafe.Ingredients.*;

/**
 * Created by 777 on 18.03.2016.
 */
public class BlackCoffee extends Product {
    public BlackCoffee(){}

    public BlackCoffee(IngredientPriceList i){
        this(i,200, 15, 15);
    }
    public BlackCoffee(IngredientPriceList i, int waterAmount, int sugarAmount, int coffeeAmount){
        name = "Black coffee";
        this.i = i;
        ingredients[0] = new Water(waterAmount);
        ingredients[1] = new Sugar(sugarAmount);
        ingredients[2] = new Coffee(coffeeAmount);
        this.price = Math.rint(100.0 * countPrice()) / 100.0;
    }

    @Override
    public double countPrice() {
        return ingredients[0].getAmount()/i.getIPList()[0].getAmount()*i.getIPList()[0].getPrice()+
                ingredients[1].getAmount()/i.getIPList()[1].getAmount()*i.getIPList()[1].getPrice() +
                ingredients[2].getAmount()/i.getIPList()[8].getAmount()*i.getIPList()[8].getPrice();
    }
}
