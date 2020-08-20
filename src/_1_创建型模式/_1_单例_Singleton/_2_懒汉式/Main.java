package _1_创建型模式._1_单例_Singleton._2_懒汉式;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // 测试
        System.out.println("懒汉式1，线程不安全");
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

    private static void test2() {
        // 测试
        System.out.println("懒汉式2，线程安全，但加锁会严重影响并发性能");
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 懒汉式1，线程不安全
class Singleton1 {
    // 1.静态字段引用唯一实例:
    private static Singleton1 instance;

    // 2.构造器私有化，外部不能 new
    private Singleton1() {}

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

// 懒汉式2，线程安全，同步方法，但加锁会严重影响并发性能
class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {};

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}


// 懒汉式3，线程安全，双重检查，由于Java的内存模型，双重检查在这里不成立
class Singleton3 {
    private static volatile Singleton3 instance;
    private Singleton3() {};

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized(Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

// 懒汉式4，线程安全，利用 java 类装载机制来保证线程安全
class Singleton4 {
    private Singleton4() {};
    private static class SingletonInstance {
        private final static Singleton4 INSTANCE = new Singleton4();
    };
    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

