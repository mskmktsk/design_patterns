package _3_行为型模式._1_模版方法模式_Template_Method._1_数据库读取设置;

import java.util.HashMap;
import java.util.Map;

public class LocalSetting extends AbstractSetting {
    private final Map<String, String> cache = new HashMap<>();

    public LocalSetting(Source source) {
        super(source);
    }

    protected String lookupCache(String key) {
        return cache.get(key);
    }

    protected void putIntoCache(String key, String value) {
        cache.put(key, value);
    }
}
