package _3_行为型模式._2_命令模式_Command;

public class LightOnCommand implements Command {
    private LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.on();
    }

    public void undo() {
        receiver.off();
    }
}
