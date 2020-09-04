package _3_行为型模式._2_命令模式_Command;

public class LightOffCommand implements Command {
    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.off();
    }

    public void undo() {
        receiver.on();
    }
}
