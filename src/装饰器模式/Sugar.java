package 装饰器模式;

import java.sql.Driver;

public class Sugar extends Condiment {
    private Drink drink;

    public Sugar(Drink drink){
        this.drink = drink;
    }


    @Override
    public String getDesc() {
        return drink.getDesc()+"+"+"加糖";
    }

    @Override
    public double getCost() {
        return 1+drink.getCost();
    }
}
