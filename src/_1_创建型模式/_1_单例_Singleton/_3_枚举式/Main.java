package _1_创建型模式._1_单例_Singleton._3_枚举式;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.sayOK();
        instance2.sayOK();
    }
}
// 使用枚举来创建单例，可以防止反序列化重新创建新的对象
enum Singleton {
    INSTANCE;
    public void sayOK() {
        System.out.println("OK");
    }
}