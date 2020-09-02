package _3_行为型模式._1_模版方法模式_Template_Method._2_豆浆制作;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 红豆豆浆制作流程 ===");
        SoyaMilk redBean = new RedBeanSoyaMilk();
        redBean.make();

        System.out.println("=== 花生豆浆制作流程 ===");
        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

        System.out.println("=== 纯豆浆制作流程 ===");
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();
    }
}
