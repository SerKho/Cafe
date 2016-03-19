package Cafe.Ingredients;

import java.util.Arrays;

/**
 * Created by 777 on 18.03.2016.
 */
public class IngredientPriceList {
    private Ingredient[] IPList;
    private int num;

    public Ingredient[] getIPList() {
        return IPList;
    }

    public void setIPList(Ingredient[] IPList) {
        this.IPList = IPList;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void addNewIngredient(Ingredient i){
        if(IPList.length==(num-1)){
            Ingredient[]array = new Ingredient[num+5];
            array = Arrays.copyOf(IPList,num-1);
            IPList = array;
        }
        IPList[num] = i;
        num++;
    }

    public void printIPList(){
        System.out.println("- INGREDIENT PRICE LIST -");
        System.out.println("name  | amount | price");
        int k = 1;
        for(Ingredient i: IPList){

            if(i == null){
                break;
            }
            else{
                System.out.println(k+". " + i.getName() + " | "+ i.getAmount() + " | "+ i.getPrice());
                k++;
            }
        }
    }

    public void makeIPL(){
        Ingredient[]array = new Ingredient[9];
        this.num = 10;

        array[0] = new Water(200, 0.2);
        array[1] = new Sugar(15, 0.2);
        array[2] = new Milk(200, 0.4);
        array[3] = new MilkFoam(200, 0.5);
        array[4] = new BlackTea(5, 0.3);
        array[5] = new GreenTea(5, 0.3);
        array[6] = new TeaWithBergamot(5, 0.5);
        array[7] = new Chocolate(200, 0.8);
        array[8] = new Coffee(15, 0.6);

        this.IPList = array;

    }
}
