package _3_行为型模式._1_模版方法模式_Template_Method._1_数据库读取设置;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟 redis 进行缓存
 */
public class RedisSetting extends AbstractSetting {
    private final Map<String, String> redis = new HashMap<>();

    public RedisSetting(Source source) {
        super(source);
    }

    protected String lookupCache(String key) {
        return redis.get(key);
    }

    protected void putIntoCache(String key, String value) {
        redis.put(key, value);
    }
}
