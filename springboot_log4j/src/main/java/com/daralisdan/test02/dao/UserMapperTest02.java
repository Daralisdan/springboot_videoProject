package com.daralisdan.test02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.daralisdan.entity.User;

/**
 * 
 * Description：该接口类是test02数据源<br>
 * @author yaodan  <br>
 * date 2019年9月2日 下午9:48:19 <br>
 */
public interface UserMapperTest02 {

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
