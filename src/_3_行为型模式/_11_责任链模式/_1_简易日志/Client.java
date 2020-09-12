package _3_行为型模式._11_责任链模式._1_简易日志;

public class Client {
    private static AbstractLogger getChainOfResponsibility() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLooger(fileLogger);
        fileLogger.setNextLooger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfResponsibility();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an infomation.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level infomation");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is a error level infomation");
    }
}
