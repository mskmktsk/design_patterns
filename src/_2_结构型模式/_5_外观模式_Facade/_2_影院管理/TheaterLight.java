package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    private TheaterLight() {}

    public static TheaterLight getInstance() {
        return instance;
    }

    public void dim() {
        System.out.println(" theaterLight dim ");
    }

    public void light() {
        System.out.println(" theaterLight light ");
    }
}
