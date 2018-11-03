package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PowerMapper {

    List<AdminUser> queryadmin(@Param("st") Integer page,@Param("end") Integer rows);

    long queryadminCount();

    long queryroleCount();

    List<Role> queryrole(@Param("st")Integer start, @Param("end")Integer rows);

    List<AdminRole> queryRole(@Param("uid")Integer uid);

    void deleteRole(@Param("uid")Integer userId);

    void saveRole(@Param("uid")Integer userId, @Param("roleIds")String[] roleIds);

    List<Tree> queryTreeByPid(@Param("pid")int pid);

    void deletepower(@Param("rid")Integer rid);

    void addpower(@Param("rid")Integer rid,@Param("ids") String[] ids);

    void deleteadmin(@Param("uid")Integer uid);

    void deleterole(@Param("id")Integer id);

    void addroles(Role role);

    void updateroles(Role role);

    Role queryRoles(Integer id);

    int deletes(@Param("ids")String[] idss);

    List<RoleTree> queryroletree(Integer rid);
}
