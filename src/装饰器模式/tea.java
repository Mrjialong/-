package 装饰器模式;

public class tea extends Drink {

    public tea(){
        desc = "茶";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
