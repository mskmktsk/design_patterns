package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {}

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd play ");
    }

    public void pause() {
        System.out.println(" dvd pause ");
    }
}
