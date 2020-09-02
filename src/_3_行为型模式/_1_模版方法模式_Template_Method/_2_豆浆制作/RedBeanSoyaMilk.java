package _3_行为型模式._1_模版方法模式_Template_Method._2_豆浆制作;

public class RedBeanSoyaMilk extends SoyaMilk {
    protected void addCondiments() {
        System.out.println("第二步：选择红豆作为调料");
    }
}
