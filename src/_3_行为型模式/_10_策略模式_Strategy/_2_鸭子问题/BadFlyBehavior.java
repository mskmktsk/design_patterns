package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class BadFlyBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("飞的一般!");
    }
}
