package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public class Coffee extends Drink {

    public Coffee() {
        setDesc("一般咖啡");
    }

    public double cost() {
        return 5;
    }

}
