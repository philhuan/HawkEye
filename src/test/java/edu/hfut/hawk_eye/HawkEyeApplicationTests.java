package edu.hfut.hawk_eye;

import edu.hfut.hawk_eye.mapper.UserMapper;
import edu.hfut.hawk_eye.entity.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

        System.out.println(userMapper.getUser("hhh","123"));

    }


}
