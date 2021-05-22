package com.zc.demo03;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Data
//  我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //  被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //  生成得到代理对象
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //  处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        //  动态代理的本质就是使用反射机制实现！
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    //  增加打印日志功能
    public void log(String message) {
        System.out.println("[DeBug]执行了" + message + "方法");
    }
}
