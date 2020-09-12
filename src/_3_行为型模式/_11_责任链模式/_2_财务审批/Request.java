package _3_行为型模式._11_责任链模式._2_财务审批;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String toString() {
        return new StringJoiner(", ", Request.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("amount=" + amount)
                .toString();
    }
}
