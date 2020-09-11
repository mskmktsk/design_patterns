package _3_行为型模式._9_状态模式_State._2_聊天机器人;

public class BotContext {
    private State state = new DisconnectedState();

    public String chat(String input) {
        if ("hello".equalsIgnoreCase(input)) {
            state = new ConnectedState();
            return state.init();
        } else if ("bye".equalsIgnoreCase(input)) {
            state = new DisconnectedState();
            return state.init();
        }
        return state.reply(input);
    }
}
