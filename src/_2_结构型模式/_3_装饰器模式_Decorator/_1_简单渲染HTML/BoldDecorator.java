package _2_结构型模式._3_装饰器模式_Decorator._1_简单渲染HTML;

public class BoldDecorator extends NodeDecorator {

    public BoldDecorator(TextNode target) {
        super(target);
    }

    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
