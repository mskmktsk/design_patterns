package _3_行为型模式._9_状态模式_State._2_聊天机器人;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BotContext context = new BotContext();
        while(true) {
            System.out.print("> ");
            String input = scan.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                System.exit(0);
            }
            String output = context.chat(input);
            System.out.println(output.isEmpty() ? "(no reply)" : "< " + output);
        }
    }
}
