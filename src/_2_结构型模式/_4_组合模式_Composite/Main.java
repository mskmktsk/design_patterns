package _2_结构型模式._4_组合模式_Composite;

public class Main {
    public static void main(String[] args) {
        Node html = new ElementNode("html");
        html.add(new ElementNode("head")
                .add(new ElementNode("title")
                .add(new TextNode("组合 - Composite"))));
        html.add(new ElementNode("body")
                .add(new CommentNode("标题注释"))
                .add(new ElementNode("h1")
                        .add(new TextNode("标题")))
                .add(new ElementNode("p")
                        .add(new TextNode("段落内容"))));
        System.out.println(html.toXML());
    }
}
