package _1_创建型模式._2_工厂_Factory._1_简单工厂模式_订购披萨.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作希腊披萨 准备原材料");
    }
}
