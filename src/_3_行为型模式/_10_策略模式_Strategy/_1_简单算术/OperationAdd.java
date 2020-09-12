package _3_行为型模式._10_策略模式_Strategy._1_简单算术;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
