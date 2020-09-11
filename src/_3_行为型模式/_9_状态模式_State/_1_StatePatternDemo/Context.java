package _3_行为型模式._9_状态模式_State._1_StatePatternDemo;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
