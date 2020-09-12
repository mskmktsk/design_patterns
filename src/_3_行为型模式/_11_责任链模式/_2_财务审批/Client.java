package _3_行为型模式._11_责任链模式._2_财务审批;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        // 构造责任链
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());
        // 处理请求
        chain.process(new Request("Bob", new BigDecimal("12.34")));
        chain.process(new Request("Alice", new BigDecimal("123.45")));
        chain.process(new Request("Jack", new BigDecimal("1234.56")));
        chain.process(new Request("Miku", new BigDecimal("12345.67")));
        chain.process(new Request("John", new BigDecimal("123456.78")));
    }
}
