package _3_行为型模式._1_模版方法模式_Template_Method._2_豆浆制作;

public abstract class SoyaMilk {
    public final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    private void select() {
        System.out.println("第一步：选择优质黄豆");
    };

    protected abstract void addCondiments();

    private void soak() {
        System.out.printf("第%s步：浸泡\n", customerWantCondiments() ? "三" : "二");
    };

    private void beat() {
        System.out.printf("第%s步：研磨\n", customerWantCondiments() ? "四" : "三");
    };

    protected boolean customerWantCondiments() {
        return true;
    }
}
