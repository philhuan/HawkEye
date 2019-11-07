package edu.hfut.hawk_eye.service.impl;

import edu.hfut.hawk_eye.entity.News;
import edu.hfut.hawk_eye.mapper.NewsMapper;
import edu.hfut.hawk_eye.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hjw
 */
@Service
public class NewsServiceImpl implements NewsService {

    private static final int CONTENT_MAX_LENGTH =100;//新闻内容最大长度

    @Autowired
    NewsMapper newsMapper;

    @Override
    public boolean add(News news) {
        return newsMapper.addNews(news) > 0;
    }

    @Override
    public boolean delete(int id) {
        return newsMapper.deleteNews(id) > 0;
    }

    @Override
    public List<News> search(String key) {
        return newsMapper.selectNewsByKey(key);
    }

    @Override
    public List<News> getAll() {
        List<News> newsList = newsMapper.selectALLNews();
        for(int i=0;i<newsList.size();i++){
            News news =newsList.get(i);
            String content=news.getContent();

            /**
             * 内容长度多于CONTENT_MAX_LENGTH时，
             * 截取CONTENT_MAX_LENGTH长度的内容
             */
            if(content.length()>CONTENT_MAX_LENGTH){
                content=content.substring(0,CONTENT_MAX_LENGTH);
                content=content+"...";
                news.setContent(content);

                newsList.set(i,news);
            }


        }
        return newsList;
    }

    @Override
    public boolean update(News news) {
        return newsMapper.updateNews(news) > 0;
    }

    @Override
    public News getById(int newsId) {
        return newsMapper.selectNewsById(newsId);
    }

}
