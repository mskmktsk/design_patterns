package _2_结构型模式._7_代理模式_Proxy._3_Cglib代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private User target;

    public ProxyFactory(User target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1.创建工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置增强对象的父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建增强对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
    }
}
