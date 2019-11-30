package com.daralisdan.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.daralisdan.entity.User;

public interface UserMapper {

  /**
      * 查询用户
   */
  @Select("select * from user where name=#{name}")
  User findByName(@Param("name") String name);

  /**
   * 新增用户
   */
  @Insert("insert into user(name,age) values(#{name},#{age})")
  int insert(@Param("name") String name, @Param("age") Integer age);
}
