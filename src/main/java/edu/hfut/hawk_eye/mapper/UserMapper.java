package edu.hfut.hawk_eye.mapper;

import edu.hfut.hawk_eye.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author yxs
 */
@Repository
public interface UserMapper {

//    static final String TABLE_NAME = "t_user";
//
//    @Select("SELECT * FROM " + TABLE_NAME)
//    List<User> getAllUsers();
//
//    @Insert("INSERT INTO " +  TABLE_NAME + "(username, password) VALUES(#{name}, #{password})")
//    int insert(@Param("name") String name, @Param("password") String password);

    /**
     * 获取用户
     * @param userName
     * @param password
     * @return 对应User对象
     */
    User getUser(String userName, String password);

    /**
     * 根据id获取用户
     * @param userName
     * @param password
     * @return 对应User对象
     */
    User getUserById(int id);


    /**
     *加入用户
     * @param u
     * @return 返回成功影响行数量（1）
     */
    int addUser(User u);

    /**
     * 按id修改密码
     * @param userid
     * @param repassword
     * @return 返回成功影响行数量（1）
     */
    int updatePwd(int userid, String repassword);

    /**
     * 获取用户链表
     * @return 用户链表
     */
    List<User> getUsers();

    /**
     *根据ID删除用户
     * @param id
     * @return 返回成功影响行数量（1）
     */
    int deleteUser(int id);



}

