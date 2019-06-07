package com.ldx.ibookprovider.mapper;

import com.ldx.ibookcommon.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ldx
 * @date 2019/6/2 14:25
 * @Description:
 */
@Mapper
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "user_name", property = "userName"),
            @Result(column = "user_pwd", property = "userPwd"),
            @Result(column = "user_email", property = "userEmail"),
            @Result(column = "user_img", property = "userImg"),
            @Result(column = "user_wallet", property = "userWallet"),
            @Result(column = "user_address", property = "userAddress"),
           })
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(Integer id);
}