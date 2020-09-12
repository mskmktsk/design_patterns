package _3_行为型模式._11_责任链模式._1_简易日志;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLooger;

    public void setNextLooger(AbstractLogger nextLooger) {
        this.nextLooger = nextLooger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLooger != null) {
            nextLooger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
