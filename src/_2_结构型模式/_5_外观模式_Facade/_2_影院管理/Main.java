package _2_结构型模式._5_外观模式_Facade._2_影院管理;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println("=== 准备 ===");
        facade.ready();
        System.out.println("=== 开始 ===");
        facade.play();
        System.out.println("=== 暂停 ===");
        facade.pause();
        System.out.println("=== 结束 ===");
        facade.end();
    }
}
