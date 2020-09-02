package _3_行为型模式._1_模版方法模式_Template_Method._2_豆浆制作;

public class PeanutSoyaMilk extends SoyaMilk {
    protected void addCondiments() {
        System.out.println("第二步：选择花生作为调料");
    }
}
