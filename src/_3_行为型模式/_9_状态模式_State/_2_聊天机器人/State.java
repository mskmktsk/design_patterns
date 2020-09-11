package _3_行为型模式._9_状态模式_State._2_聊天机器人;

public interface State {
    String init();
    String reply(String input);
}
