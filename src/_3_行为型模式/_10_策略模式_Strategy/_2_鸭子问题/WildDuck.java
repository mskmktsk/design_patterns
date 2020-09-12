package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    public void display() {
        System.out.println("这是野鸭");
    }
}
