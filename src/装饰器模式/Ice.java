package 装饰器模式;

public class Ice extends Condiment {
    private Drink drink;

    public Ice(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDesc() {
        return drink.getDesc()+"+"+"冰";
    }

    @Override
    public double getCost() {
        return 0.5+drink.getCost();
    }
}
