package _2_结构型模式._7_代理模式_Proxy._3_Cglib代理;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User proxy = (User) new ProxyFactory(user).getProxyInstance();
        proxy.signin();
        proxy.signout();
        proxy.register();
        proxy.forget();
    }
}
