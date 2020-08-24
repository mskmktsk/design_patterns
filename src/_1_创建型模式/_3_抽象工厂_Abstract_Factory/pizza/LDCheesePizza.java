package _1_创建型模式._3_抽象工厂_Abstract_Factory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作伦敦奶酪披萨 准备原材料");
        setName("伦敦奶酪披萨");
    }
}
