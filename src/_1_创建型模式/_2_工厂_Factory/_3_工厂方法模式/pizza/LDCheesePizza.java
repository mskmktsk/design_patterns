package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作伦敦奶酪披萨 准备原材料");
        setName("伦敦奶酪披萨");
    }
}
