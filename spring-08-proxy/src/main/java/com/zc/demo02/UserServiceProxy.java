package com.zc.demo02;

import lombok.Data;

@Data
public class UserServiceProxy implements UserService {

    UserServiceImpl userService;

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //  日志方法
    public void log(String message) {
        System.out.println("[DeBug]使用了" + message + "方法");
    }
}
