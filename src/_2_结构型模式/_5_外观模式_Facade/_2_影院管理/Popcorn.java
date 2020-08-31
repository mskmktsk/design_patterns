package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn() {}

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn off ");
    }

    public void pop() {
        System.out.println(" popcorn is poping ");
    }
}
