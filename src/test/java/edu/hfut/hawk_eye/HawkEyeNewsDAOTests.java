package edu.hfut.hawk_eye;

import edu.hfut.hawk_eye.entity.News;
import edu.hfut.hawk_eye.entity.User;
import edu.hfut.hawk_eye.mapper.NewsMapper;
import edu.hfut.hawk_eye.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@MapperScan("edu.hfut.hawk_eye.mapper") //扫描的mapper
@SpringBootTest
class HawkEyeNewsDAOTests {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    void contextLoads() {
    }


    @Test
    public void testAddNews(){


        News news = new News();
        news.setContent("this is content");
        DateFormat pubTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String pubTime = pubTimeFormat.format(new Date());
        news.setPubTime(pubTime);
        news.setTitle("testTitle");
        news.setUserId(112);

        System.out.println(newsMapper.addNews(news));



    }

    @Test
    public void testSelectNewsByKey(){

        System.out.println(newsMapper.selectNewsByKey("23"));


    }

    @Test
    public void testDeleteNews(){

        System.out.println(newsMapper.deleteNews(23));

    }

    @Test
    public void testUpdateNews(){

        News news = new News();
        news.setContent("this is content1");
        DateFormat pubTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String pubTime = pubTimeFormat.format(new Date());
        news.setPubTime(pubTime);
        news.setTitle("testTitle1");
        news.setUserId(112);
        news.setId(21);

        System.out.println(newsMapper.updateNews(news));


    }

    @Test
    public void testSelectALLNews(){


        System.out.println(newsMapper.selectALLNews());

    }

    @Test
    public void testSelectNewsById(){


        System.out.println(newsMapper.selectNewsById(20));

    }





}
