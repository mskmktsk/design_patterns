package _1_创建型模式._5_生成器_Builder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Builder {
    public static void main(String[] args) {
        Map<String, String> queries = new HashMap<>();
        queries.put("a", "123");
        queries.put("q", "K&R");
        String url = URLBuilder.builder()
                .setScheme("https")
                .setDomain("www.liaoxuefeng.com")
                .setPath("?")
                .setQueries(queries)
                .build();
        System.out.println(url);
    }
}

/**
 *
 */
class URLBuilder {
    private String scheme = "http";
    private int port = -1;
    private String domain = null;
    private String path = "/";
    private String username = null;
    private String password = null;
    private Map<String, String> queries = null;

    public static URLBuilder builder() {
        return new URLBuilder();
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(scheme).append("://");
        if (username != null && password != null) {
            sb.append(username).append(":").append(password).append("@");
        }
        sb.append(domain);
        if (port >= 0) {
            sb.append(":").append(port);
        }
        sb.append(path);
        if (queries != null && !queries.isEmpty()) {
            queries.forEach((k, v) -> {
                try {
                    sb.append(URLEncoder.encode(k, String.valueOf(StandardCharsets.UTF_8)))
                            .append("=")
                            .append(URLEncoder.encode(v, String.valueOf(StandardCharsets.UTF_8)))
                            .append("&");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            });
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public URLBuilder setScheme(String scheme) {
        this.scheme = Objects.requireNonNull(scheme);
        return this;
    }

    public URLBuilder setPort(int port) {
        if (port < 0 || port > 65535) {
            throw new IllegalArgumentException("Invalid port");
        }
        this.port = port;
        return this;
    }

    public URLBuilder setDomain(String domain) {
        this.domain = Objects.requireNonNull(domain);
        return this;
    }

    public URLBuilder setPath(String path) {
        this.path = Objects.requireNonNull(path);
        return this;
    }

    public URLBuilder setCredential(String username, String password) {
        this.username = Objects.requireNonNull(username);
        this.password = Objects.requireNonNull(password);
        return this;
    }

    public URLBuilder setQueries(Map<String ,String> queries) {
        this.queries = queries;
        return this;
    }

}