package _1_创建型模式._2_工厂_Factory._3_工厂方法模式.pizza;

public class SZPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作深圳胡椒披萨 准备原材料");
        setName("深圳胡椒披萨");
    }
}
