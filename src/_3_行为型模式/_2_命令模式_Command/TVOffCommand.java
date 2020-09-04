package _3_行为型模式._2_命令模式_Command;

public class TVOffCommand implements Command {
    private TVReceiver receiver;

    public TVOffCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.off();
    }

    public void undo() {
        receiver.on();
    }
}
