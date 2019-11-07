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
        return newsMapper.selectALLNews();
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
