package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    public void display() {
        System.out.println("这是北京鸭");
    }
}
