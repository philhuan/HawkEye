package edu.hfut.hawk_eye.service;

import edu.hfut.hawk_eye.entity.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {

    public boolean add(News news);

    boolean delete(int id);

    List<News> search(String key);

    List<News> getAll();

    boolean update(News news);


}
