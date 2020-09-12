package _3_行为型模式._11_责任链模式._2_财务审批;

public interface Handler {
    // 返回 Boolean.TRUE = 成功
    // 返回 Boolean.FALSE = 失败
    // 返回 null = 无法处理
    Boolean process(Request request);
}
