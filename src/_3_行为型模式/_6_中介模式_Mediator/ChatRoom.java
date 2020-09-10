package _3_行为型模式._6_中介模式_Mediator;

import java.time.LocalDateTime;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(LocalDateTime.now().toString() + " [" + user.getName() + "]: "
        + message);
    }
}
