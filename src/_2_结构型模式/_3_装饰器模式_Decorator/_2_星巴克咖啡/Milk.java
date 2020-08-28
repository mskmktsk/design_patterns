package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        super.setDesc("牛奶");
    }

    public String getDesc() {
        return drink.getDesc() + " + " + super.getDesc();
    }

    public double cost() {
        return drink.cost() + 3.0;
    }

}
