package com.zc.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //  代理，中介帮房东租房子。但是代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);

        //  不用面对房东，直接在中介租房即可
        proxy.rent();
    }
}
