package _3_行为型模式._2_命令模式_Command;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int no, Command on, Command off) {
        onCommands[no] = on;
        offCommands[no] = off;
    }

    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed() {
        if (undoCommand instanceof NoCommand) {
            return;
        }
        undoCommand.undo();
        undoCommand = new NoCommand();
    }

}
