package com.zc.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//  这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {

    @Value("张三")
    private String name;
}
