package Cafe.Products;

import Cafe.Ingredients.Ingredient;
import Cafe.Ingredients.IngredientPriceList;

/**
 * Created by 777 on 18.03.2016.
 */
public class Product {
    IngredientPriceList i;
    Ingredient[]ingredients = new Ingredient[20];
    String name;
    double price;

    public IngredientPriceList getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public Product(){}

    public Product(IngredientPriceList i,String name, double price){
        this.i = i;
        this.name = name;
        this.price = price;
    }

    public double countPrice(){
        return price;
    }

    public void printProduct(){
        System.out.println(getName()+"   "+getPrice());
    }
}
