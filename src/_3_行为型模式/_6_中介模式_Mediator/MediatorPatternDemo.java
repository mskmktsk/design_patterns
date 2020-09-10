package _3_行为型模式._6_中介模式_Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User lc = new User("lc");
        User os = new User("os");

        lc.sendMessage("你好，os");
        os.sendMessage("你好，lc");
    }
}
