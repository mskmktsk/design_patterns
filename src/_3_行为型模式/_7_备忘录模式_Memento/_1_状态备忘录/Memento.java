package _3_行为型模式._7_备忘录模式_Memento._1_状态备忘录;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
