package _3_行为型模式._1_模版方法模式_Template_Method._2_豆浆制作;

public class PureSoyaMilk extends SoyaMilk {
    protected void addCondiments() {

    }

    protected boolean customerWantCondiments() {
        return false;
    }
}
