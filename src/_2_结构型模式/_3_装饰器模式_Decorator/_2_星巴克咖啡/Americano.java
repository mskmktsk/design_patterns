package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public class Americano extends Coffee {

    public Americano() {
        setDesc("美式咖啡");
    }

    public double cost() {
        return super.cost() + 1.0;
    }

}
