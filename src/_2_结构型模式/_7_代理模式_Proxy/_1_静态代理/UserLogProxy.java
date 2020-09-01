package _2_结构型模式._7_代理模式_Proxy._1_静态代理;

public class UserLogProxy implements Action {
    private Action target;

    public UserLogProxy(Action target) {
        this.target = target;
    }

    public void signin() {
        System.out.println("登录日志");
        this.target.signin();
    }

    public void signout() {
        System.out.println("登出日志");
        this.target.signout();
    }

    public void register() {
        System.out.println("注册日志");
        this.target.register();
    }

    public void forget() {
        System.out.println("忘记密码日志");
        this.target.forget();
    }
}
