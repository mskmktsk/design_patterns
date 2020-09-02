package _2_结构型模式._7_代理模式_Proxy._2_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Action target;

    public ProxyFactory(Action target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        InvocationHandler handler = (proxy, method, args) -> {
            switch (method.getName()) {
                case "signin":
                    System.out.println("登录日志");
                    break;
                case "signout":
                    System.out.println("登出日志");
                    break;
                case "register":
                    System.out.println("注册日志");
                    break;
                case "forget":
                    System.out.println("找回密码日志");
                    break;
                default:
                    System.out.println("其余日志");
            }
            Object result = method.invoke(target, args);
            return result;
        };
        return Proxy.newProxyInstance(
                Action.class.getClassLoader(), //target.getClass().getClassLoader()
                new Class[] { Action.class } , // target.getClass().getInterfaces();
                handler);
    }
}
