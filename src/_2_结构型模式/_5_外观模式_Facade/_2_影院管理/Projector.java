package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class Projector {
    private static Projector instance = new Projector();

    private Projector() {}

    public static Projector getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" projector up ");
    }

    public void donw() {
        System.out.println(" projector down ");
    }

    public void play() {
        System.out.println(" projector play ");
    }

    public void stop() {
        System.out.println(" projector stop ");
    }
}
