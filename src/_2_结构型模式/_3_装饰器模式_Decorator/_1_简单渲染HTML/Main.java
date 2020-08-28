package _2_结构型模式._3_装饰器模式_Decorator._1_简单渲染HTML;

public class Main {
    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new UnderlineDecorator(new SpanNode()));
        TextNode n3 = new ItalicDecorator(new BoldDecorator(new SpanNode()));
        n1.setText("Hello");
        n2.setText("Decorated");
        n3.setText("World");
        System.out.println(n1.getText());
        System.out.println(n2.getText());
        System.out.println(n3.getText());
    }
}
