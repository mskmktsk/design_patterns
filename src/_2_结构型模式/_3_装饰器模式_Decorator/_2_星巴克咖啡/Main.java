package _2_结构型模式._3_装饰器模式_Decorator._2_星巴克咖啡;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Espresso espresso = new Espresso();
        Americano americano = new Americano();
        Milk milk1 = new Milk(espresso);
        Chocolate chocolate1 = new Chocolate(espresso);
        Milk milk2 = new Milk(chocolate1);
        Chocolate chocolate2 = new Chocolate(new Milk(new Chocolate(americano)));
        System.out.println(coffee.getDesc() + "，价格：" + coffee.cost());
        System.out.println(espresso.getDesc() + "，价格：" + espresso.cost());
        System.out.println(americano.getDesc() + "，价格：" + americano.cost());
        System.out.println(milk1.getDesc() + "，价格：" + milk1.cost());
        System.out.println(chocolate1.getDesc() + "，价格：" + chocolate1.cost());
        System.out.println(milk2.getDesc() + "，价格：" + milk2.cost());
        System.out.println(chocolate2.getDesc() + "，价格：" + chocolate2.cost());
    }
}
