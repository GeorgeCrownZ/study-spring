package com.zc.mapper;

import com.zc.pojo.User;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

@Data
public class UserMapperImpl implements UserMapper {

    //  在原来我们的所有操作都是用sqlSession来执行，现在都是用sqlSessionTemplate；
    private SqlSessionTemplate sqlSessionTemplate;

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
