package _3_行为型模式._10_策略模式_Strategy._1_简单算术;

public class Client {
    public static void main(String[] args) {
        Context add = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + add.execute(10, 5));

        Context subtract = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + subtract.execute(10, 5));

        Context multiply = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + multiply.execute(10, 5));
    }
}
