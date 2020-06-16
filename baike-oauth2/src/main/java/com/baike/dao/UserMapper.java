package com.baike.dao;

import com.baike.domin.User;
import com.baike.model.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("select username, password, authorities from user where username=#{username}")
    List<MyUser> selectUserByUserName(String username);
}
