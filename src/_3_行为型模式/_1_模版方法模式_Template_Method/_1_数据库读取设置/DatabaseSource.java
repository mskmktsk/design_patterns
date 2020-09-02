package _3_行为型模式._1_模版方法模式_Template_Method._1_数据库读取设置;

public class DatabaseSource implements Source {
    public String read(String key) {
        return "database:" + key;
    }
}
