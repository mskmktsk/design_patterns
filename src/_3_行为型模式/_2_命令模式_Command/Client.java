package _3_行为型模式._2_命令模式_Command;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式，完成通过遥控器对电灯，电视的操作
        // 创建一个电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        // 创建电灯相关的命令
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        // 创建一个遥控器
        RemoteController controller = new RemoteController();

        // 设置控制器命令
        controller.setCommand(0, lightOnCommand, lightOffCommand);

        // 对电灯进行操作
        System.out.println("========== 以下是电灯操作 ==========");
        System.out.println("===== 按下电灯的开灯键 =====");
        controller.onButtonWasPushed(0);
        System.out.println("===== 按下撤回键 =====");
        controller.undoButtonWasPushed();
        System.out.println("===== 按下电灯的关灯键 =====");
        controller.offButtonWasPushed(0);
        System.out.println("===== 按下撤回键 =====");
        controller.undoButtonWasPushed();

        // 创建一个电视的对象（接受者）
        TVReceiver tvReceiver = new TVReceiver();

        // 创建电视相关的命令
        Command tvOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);

        // 设置控制器命令
        controller.setCommand(1, tvOnCommand, tvOffCommand);

        // 对电视进行操作
        System.out.println("========== 以下是电视操作 ==========");
        System.out.println("===== 按下电视的打开键 =====");
        controller.onButtonWasPushed(1);
        System.out.println("===== 按下撤回键 =====");
        controller.undoButtonWasPushed();
        System.out.println("===== 按下电视的关闭键 =====");
        controller.offButtonWasPushed(1);
        System.out.println("===== 按下撤回键 =====");
        controller.undoButtonWasPushed();
    }
}
