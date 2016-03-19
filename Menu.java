package Cafe;

import Cafe.Ingredients.IngredientPriceList;
import Cafe.Ingredients.TeaWithBergamot;
import Cafe.Products.*;
import Frame_3_1_9.MyPersonalExeption;

/**
 * Created by 777 on 19.03.2016.
 */
public class Menu {
    private IngredientPriceList i;

    public Menu(){
        this.i = new IngredientPriceList();
        i.makeIPL();
    }

    public double order(Product[] list){
        System.out.println("");
        System.out.println("_____NEW ORDER_____");
        double res = 0;
        for(Product a: list){
            if(a==null){
                continue;
            }
                else{
                   res+= a.getPrice();
                a.printProduct();
                }
        }
        res=Math.rint(100.0 * res) / 100.0;
        System.out.println("------------------------------------");
        System.out.println("Total price: " + res +"USD");
        System.out.println("");
        return res;

    }

    public void run(){

                i.printIPList();
        Product[]a=new Product[]{new BlackTea(i), new Cafe.Products.TeaWithBergamot(i)};
        order(a);

        Product[]b=new Product[]{new Product(i,"Cake",15), new CoffeeWithMilk(i, 200, 15, 15, 400), new Americano(i),
                new Capucinno(i, 200, 30, 30, 400), new Mocaccino(i)};
        order(b);
        Product[]c=new Product[]{new Product(i,"Sweets",11), new BlackCoffee(i), new Americano(i,400, 45, 30, 600)};
        order(c);
    }

}
