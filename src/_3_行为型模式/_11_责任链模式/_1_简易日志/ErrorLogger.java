package _3_行为型模式._11_责任链模式._1_简易日志;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
