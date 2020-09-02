package _3_行为型模式._1_模版方法模式_Template_Method._1_数据库读取设置;

public abstract class AbstractSetting {
    protected Source source;

    public AbstractSetting(Source source) {
        this.source = source;
    }

    public final String getSetting(String key) {
        String value = lookupCache(key);
        if (value == null) {
            value = source.read(key);
            System.out.println(String.format("[DEBUG] load from %s: %s = %s", source.getClass().getSimpleName(), key, value));
            putIntoCache(key, value);
        } else {
            System.out.println(String.format("[DEBUG] load from cache: %s = %s", key, value));
        }
        return value;
    }

    protected abstract String lookupCache(String key);

    protected abstract void putIntoCache(String key, String value);
}
