package edu.hfut.hawk_eye.service.impl;

import edu.hfut.hawk_eye.entity.User;
import edu.hfut.hawk_eye.mapper.UserMapper;
import edu.hfut.hawk_eye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yxs
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public boolean add(User user) {
        boolean flag=false;
        if(userMapper.addUser(user)>0) {
            flag=true;
        }
        return flag;
    }



    @Override
    public boolean delete(int id) {

        boolean flag=false;
        if(userMapper.deleteUser(id) >0) {
            flag=true;
        }
        return flag;

    }





        @Override
        public boolean updatePwd(int userid, String repassword) {
            boolean flag=false;
            if(userMapper.updatePwd(userid,repassword)>0) {
                flag=true;
            }
            return flag;

        }
}
