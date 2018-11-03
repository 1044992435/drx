package com.jk.mapper;

import com.jk.model.AdminUser;
import com.jk.model.Tree;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MainMapper {

    @Select("select * from t_tree where pid=#{pid}")
    List<Tree> findMenuTreeByid(String pid);
    @Select("select * from t_adminuser where username=#{username}")
    AdminUser userName(@Param("username") String username);
    @Select("select * from t_adminuser where username=#{adminUser.username} and password=#{adminUser.password}and loginNumber=#{adminUser.loginNumber}")
    AdminUser login(@Param("adminUser") AdminUser adminUser);
    @Insert("insert into t_adminuser(username,password) values (#{adminUser.username},#{adminUser.password})")
    void addUser(@Param("adminUser") AdminUser adminUser);

}
