package com.jk.mapper;

import com.jk.model.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MainMapper {

    @Select("select * from t_tree where pid=#{pid}")
    List<Tree> findMenuTreeByid(String pid);
}
