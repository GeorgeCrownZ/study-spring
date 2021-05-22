package com.zc.mapper;

import com.zc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    //  添加一个用户
    public int addUser(@Param("user")User user);

    //  删除一个用户
    public int deleteUser(@Param("id") int id);
}
