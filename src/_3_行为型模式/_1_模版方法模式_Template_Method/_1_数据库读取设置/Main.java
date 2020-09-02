package _3_行为型模式._1_模版方法模式_Template_Method._1_数据库读取设置;

public class Main {
    public static void main(String[] args) {
        Source fileSource = new FileSource();
        AbstractSetting local1 = new LocalSetting(fileSource);
        AbstractSetting redis1 = new RedisSetting(fileSource);
        local1.getSetting("local1");
        redis1.getSetting("redis1");
        local1.getSetting("local1");
        redis1.getSetting("redis1");

        System.out.println("=== 分割线 ===");

        Source databaseSource = new DatabaseSource();
        AbstractSetting local2 = new LocalSetting(databaseSource);
        AbstractSetting redis2 = new RedisSetting(databaseSource);
        local2.getSetting("local2");
        redis2.getSetting("redis2");
        local2.getSetting("local2");
        redis2.getSetting("redis2");
    }
}
