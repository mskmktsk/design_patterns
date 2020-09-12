package _3_行为型模式._10_策略模式_Strategy._1_简单算术;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
