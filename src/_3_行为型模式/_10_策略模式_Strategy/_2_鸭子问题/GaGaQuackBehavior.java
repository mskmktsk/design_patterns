package _3_行为型模式._10_策略模式_Strategy._2_鸭子问题;

public class GaGaQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("GaGa 叫");
    }
}
