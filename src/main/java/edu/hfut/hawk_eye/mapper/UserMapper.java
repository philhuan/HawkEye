package edu.hfut.hawk_eye.mapper;

import edu.hfut.hawk_eye.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

//    static final String TABLE_NAME = "t_user";
//
//    @Select("SELECT * FROM " + TABLE_NAME)
//    List<User> getAllUsers();
//
//    @Insert("INSERT INTO " +  TABLE_NAME + "(username, password) VALUES(#{name}, #{password})")
//    int insert(@Param("name") String name, @Param("password") String password);

    public User getUser(String userName,String password); //登陆

}

