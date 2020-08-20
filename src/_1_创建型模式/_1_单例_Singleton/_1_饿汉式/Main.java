package _1_创建型模式._1_单例_Singleton._1_饿汉式;

public class Main {
    public static void main(String[] args) {
        test1();
    }
    public static void test1() {
        // 测试
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 饿汉式（静态常量）
class Singleton1 {
    // 1.构造器私有化，外部不能 new
    private Singleton1() {}

    // 2.静态字段引用唯一实例:
    private final static Singleton1 INSTANCE = new Singleton1();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return INSTANCE;
    };
}

// 饿汉式（静态代码块）
class Singleton2 {
    // 1.静态字段引用唯一实例:
    private static Singleton2 INSTANCE;

    static { // 在静态代码块中，创建单例对象
        INSTANCE = new Singleton2();
    }

    // 2.构造器私有化，外部不能 new
    private Singleton2() {}

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance(){
        return INSTANCE;
    };
}