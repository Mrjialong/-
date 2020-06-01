package 装饰器模式;

public class Milk extends Drink {

    public Milk(){
        desc = "牛奶";
    }

    @Override
    public double getCost() {
        return 12;
    }
}
