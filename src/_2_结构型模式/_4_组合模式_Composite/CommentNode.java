package _2_结构型模式._4_组合模式_Composite;

import java.util.ArrayList;
import java.util.List;

public class CommentNode implements Node {
    private String text;

    public CommentNode(String text) {
        this.text = text;
    }

    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    public List<Node> children() {
        return new ArrayList<>();
    }

    public String toXML() {
        return "<!--" + text + "-->";
    }
}
