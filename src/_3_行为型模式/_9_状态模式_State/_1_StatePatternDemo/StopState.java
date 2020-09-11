package _3_行为型模式._9_状态模式_State._1_StatePatternDemo;

public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state!");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
