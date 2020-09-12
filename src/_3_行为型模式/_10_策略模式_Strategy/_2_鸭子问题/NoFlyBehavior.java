package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class NoFlyBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("不会飞行!");
    }
}
