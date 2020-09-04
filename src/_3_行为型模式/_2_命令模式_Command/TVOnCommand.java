package _3_行为型模式._2_命令模式_Command;

public class TVOnCommand implements Command {
    private TVReceiver receiver;

    public TVOnCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.on();
    }

    public void undo() {
        receiver.off();
    }
}
