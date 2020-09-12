package _3_行为型模式._11_责任链模式._2_财务审批;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    // 持有所有 Handler
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public boolean process(Request request) {
        // 依次调用每个 Handler
        for (Handler handler: handlers) {
            Boolean r = handler.process(request);
            if (r != null) {
                // 如果返回 TRUE 或者 FALSE, 处理结束
                System.out.println(request + " " + (r ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return r;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}
