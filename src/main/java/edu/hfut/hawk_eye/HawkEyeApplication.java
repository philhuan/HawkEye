package edu.hfut.hawk_eye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("edu.hfut.hawk_eye.mapper") //扫描的mapper
public class HawkEyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HawkEyeApplication.class, args);
    }

}
