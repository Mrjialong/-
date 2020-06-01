package 装饰器模式;

public class DecoratorTest {
    public static void main(String[] args) {
        Drink milk = new Milk();
        double cost = milk.getCost();
        System.out.println("----------------------------");
        Drink milkTea2 = new Milk();
        milkTea2 = new Ice(milkTea2);
        cost = milkTea2.getCost();
        System.out.println(milkTea2.getDesc()+":"+cost);
        System.out.println("------------------------------");
        Drink milkTea3 = new tea();
        milkTea3 = new Ice(new Sugar(milkTea3));
        cost = milkTea3.getCost();
        System.out.println(milkTea3.getDesc()+":"+cost);
    }
}
