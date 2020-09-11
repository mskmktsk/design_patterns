package _3_行为型模式._9_状态模式_State._2_聊天机器人;

public class ConnectedState implements State {
    public String init() {
        return "Hello, I'm Bob.";
    }

    public String reply(String input) {
        String body = input.substring(0, input.length() - 1);
        if (input.endsWith("?")) {
            return "Yes. " + body + "!";
        } else if (input.endsWith(".")) {
            return body + "!";
        }
        return body + "?";
    }
}
