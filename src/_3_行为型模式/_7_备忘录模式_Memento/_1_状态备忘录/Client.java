package _3_行为型模式._7_备忘录模式_Memento._1_状态备忘录;

public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        CareTaker ct = new CareTaker();
        o.setState("State #1");
        o.setState("State #2");
        ct.add(o.saveStateToMemento());
        o.setState("State #3");
        ct.add(o.saveStateToMemento());
        o.setState("State #4");
        ct.add(o.saveStateToMemento());
        o.setState("State #5");

        System.out.println("Current " + o.getState());
        o.getStateFromMemento(ct.get(0));
        System.out.println("First " + o.getState());
        o.getStateFromMemento(ct.get(1));
        System.out.println("Second " + o.getState());
        o.getStateFromMemento(ct.get(2));
        System.out.println("Third " + o.getState());
    }
}
