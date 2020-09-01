package _2_结构型模式._6_享元模式_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Student student = Student.create(1, "lc");
        Student student1 = new Student(1, "lc");
        Student std = Student.create(1, "lc");
        Student std1 = new Student(1, "lc");
        // false
        System.out.println(student == student1);
        // true
        System.out.println(student == std);
        // false
        System.out.println(student1 == std);
        // false
        System.out.println(student1 == std1);
    }
    // 持有缓存：
    private static final Map<String, Student> cache = new HashMap<>();

    // 静态工程方法：
    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        Student student = cache.get(key);
        if (student == null) {
            // 未找到，创建新对象
            System.out.println(String.format("create new Student(%s, %s)", id, name));
            student = new Student(id, name);
            // 放入缓存：
            cache.put(key, student);
        } else {
            // 缓存中存在：
            System.out.println(String.format("return cache Student(%s, %s)", id, name));
        }
        return student;
    }

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
