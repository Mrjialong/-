package 装饰器模式;

/**
 * 被修饰器的类
 */
public abstract  class Drink {
    protected String desc;

    public String getDesc(){
        return desc;
    }
    public abstract double getCost();
}
