package _1_创建型模式._3_抽象工厂_Abstract_Factory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作伦敦胡椒披萨 准备原材料");
        setName("伦敦胡椒披萨");
    }
}
