package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class Stereo {
    private static Stereo instance = new Stereo();

    private Stereo() {}

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" stereo on ");
    }

    public void off() {
        System.out.println(" stereo off ");
    }
}
