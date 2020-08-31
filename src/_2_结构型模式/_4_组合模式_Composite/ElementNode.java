package _2_结构型模式._4_组合模式_Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ElementNode implements Node {
    private String name;
    private List<Node> list = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    public Node add(Node node) {
        list.add(node);
        return this;
    }

    public List<Node> children() {
        return list;
    }

    public String toXML() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">";
        StringJoiner sj = new StringJoiner("", start, end);
        list.forEach(node -> {
            sj.add(node.toXML() + "\n");
        });
        return sj.toString();
    }
}
