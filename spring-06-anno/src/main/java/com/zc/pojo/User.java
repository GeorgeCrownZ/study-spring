package com.zc.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//  等价于<bean id="user" class="com.zc.pojo.User"/>
//  @Component 组件
@Component
@Data
public class User {

    public String name;

    //  相当于<property name="name" value="张三" />
    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }
}
