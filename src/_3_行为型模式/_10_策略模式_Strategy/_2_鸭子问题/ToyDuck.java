package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    public void display() {
        System.out.println("这是玩具鸭");
    }
}
