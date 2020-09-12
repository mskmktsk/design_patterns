package _3_行为型模式._11_责任链模式._2_财务审批;

import java.math.BigDecimal;

public class ManagerHandler implements Handler {
    public Boolean process(Request request) {
        // 如果超过 1000 元, 处理不了, 交下一个处理
        if (request.getAmount().compareTo(new BigDecimal(1000)) > 0) {
            return null;
        }
        // 对 bob 有偏见
        return !request.getName().equalsIgnoreCase("bob");
    }
}
