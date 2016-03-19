package Cafe.Products;

import Cafe.Ingredients.IngredientPriceList;
import Cafe.Ingredients.Sugar;
import Cafe.Ingredients.Water;

/**
 * Created by 777 on 19.03.2016.
 */
public class TeaWithBergamot extends Product {

    public TeaWithBergamot(IngredientPriceList i){
        this(i,400, 15, 5);
    }
    public TeaWithBergamot(IngredientPriceList i, int waterAmount, int sugarAmount, int teaWithBergamotAmount){
        name = "Tea with bergamot";
        this.i = i;
        ingredients[0] = new Water(waterAmount);
        ingredients[1] = new Sugar(sugarAmount);
        ingredients[2] = new Cafe.Ingredients.TeaWithBergamot(teaWithBergamotAmount);
        this.price = Math.rint(100.0 * countPrice()) / 100.0;
    }

    @Override
    public double countPrice() {
        return ingredients[0].getAmount()/i.getIPList()[0].getAmount()*i.getIPList()[0].getPrice()+
                ingredients[1].getAmount()/i.getIPList()[1].getAmount()*i.getIPList()[1].getPrice() +
                ingredients[2].getAmount()/i.getIPList()[6].getAmount()*i.getIPList()[6].getPrice();
    }
}