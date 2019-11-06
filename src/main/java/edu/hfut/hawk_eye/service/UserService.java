package edu.hfut.hawk_eye.service;

import edu.hfut.hawk_eye.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author yxs
 */
@Service
public interface UserService {

    User login(String userName, String password);

    /**
     * 增加用户
     * @param user
     * @return
     */
    boolean add(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean delete(int id);

    /**
     * 更新密码
     * @param userid
     * @param repassword
     * @return
     */
    boolean updatePwd(int userid,String repassword);

    User getUserById(int id);
}
