package _3_行为型模式._11_责任链模式._2_财务审批;

public class CEOHandler implements Handler {
    public Boolean process(Request request) {
        return true;
    }
}
