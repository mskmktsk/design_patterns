package _2_结构型模式._4_组合模式_Composite;

import java.util.List;

public interface Node {
    // 添加一个子节点
    Node add(Node node);
    // 获取子节点
    List<Node> children();
    // 输出为 XML
    String toXML();
}
