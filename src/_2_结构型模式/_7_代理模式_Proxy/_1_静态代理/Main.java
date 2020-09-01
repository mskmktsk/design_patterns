package _2_结构型模式._7_代理模式_Proxy._1_静态代理;

public class Main {
    public static void main(String[] args) {
        Action user = new User();
        Action userProxy = new UserLogProxy(user);
        userProxy.signin();
        userProxy.signout();
        userProxy.register();
        userProxy.forget();
    }
}
