package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDesc("巧克力");
    }

    public String getDesc() {
        return drink.getDesc() + " + " + super.getDesc();
    }

    public double cost() {
        return drink.cost() + 3.0;
    }
}
