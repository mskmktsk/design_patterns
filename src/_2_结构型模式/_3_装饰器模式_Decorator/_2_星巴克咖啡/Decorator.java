package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public abstract class Decorator extends Drink {

    protected final Drink drink;

    protected Decorator(Drink drink) {
        this.drink = drink;
    }

}
