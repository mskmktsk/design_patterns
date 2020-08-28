package _2_结构型模式._3_装饰器模式_Decorator._1_简单渲染HTML;

public class SpanNode implements TextNode {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
