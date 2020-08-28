package _2_结构型模式._3_装饰器模式_Decorator._1_简单渲染HTML;

public abstract class NodeDecorator implements TextNode {
    protected final TextNode target;

    protected NodeDecorator(TextNode target) {
        this.target = target;
    }

    public void setText(String text) {
        target.setText(text);
    }
}
