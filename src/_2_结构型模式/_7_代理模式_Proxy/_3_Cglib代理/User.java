package _2_结构型模式._7_代理模式_Proxy._3_Cglib代理;

public class User {

    public void signin() {
        System.out.println("用户登录");
    }

    public void signout() {
        System.out.println("用户登出");
    }

    public void register() {
        System.out.println("用户注册");
    }

    public void forget() {
        System.out.println("找回密码");
    }
}
