package _2_结构型模式._7_代理模式_Proxy._2_动态代理;

public class Main {
    public static void main(String[] args) {
        Action user = new User();
        Action proxy = (Action) new ProxyFactory(user).getProxyInstance();
        proxy.signin();
        proxy.signout();
        proxy.register();
        proxy.forget();
    }
}
