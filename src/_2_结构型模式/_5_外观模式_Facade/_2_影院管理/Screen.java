package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class Screen {
    private static Screen instance = new Screen();

    private Screen() {}

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" screen up ");
    }

    public void donw() {
        System.out.println(" screen down ");
    }
}
