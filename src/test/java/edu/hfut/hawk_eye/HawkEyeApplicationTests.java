package edu.hfut.hawk_eye;

import edu.hfut.hawk_eye.mapper.UserMapper;
import edu.hfut.hawk_eye.entity.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;
import java.util.List;

@MapperScan("edu.hfut.hawk_eye.mapper") //扫描的mapper
@SpringBootTest
class HawkEyeApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }



    @Test
    public void test(){

//        userMapper.insert("hhh", "123");
//        List<User> userList = userMapper.getAllUsers();
//        System.out.println(userList);

        System.out.println(userMapper.getUser("yxs","123"));
        //User user=new User();
        //user.setUserName("test");
        //user.setPassword("test");
        //userMapper.register(user);
        //System.out.println(userMapper.register(user));

    }

    @Test
    public void testAddUser(){


        User user=new User();
        //user.setId(18);
        user.setUserName("test3");
        user.setPassword("test3");
        //userMapper.register(user);
        System.out.println(userMapper.addUser(user));



    }

    @Test
    public void testUpdatePass(){

        System.out.println(userMapper.updatePwd(111,"test2"));


    }

    @Test
    public void testGetUsers(){

        System.out.println(userMapper.getUsers());

    }

    @Test
    public void testDeleteUsr(){

        System.out.println(userMapper.deleteUser(21));

    }


}
