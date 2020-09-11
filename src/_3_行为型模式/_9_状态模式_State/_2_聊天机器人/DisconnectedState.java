package _3_行为型模式._9_状态模式_State._2_聊天机器人;

public class DisconnectedState implements State {
    public String init() {
        return "Bye!";
    }

    public String reply(String input) {
        return "";
    }
}
