package _1_创建型模式._2_工厂_Factory._1_传统实现_披萨订购.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料");
    }
}
