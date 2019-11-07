package edu.hfut.hawk_eye.service;

import edu.hfut.hawk_eye.entity.News;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author hjw
 */
@Service
public interface NewsService {

    /**
     * 添加新闻
     * @param news
     * @return
     */
    boolean add(News news);

    /**
     * 删除新闻
     * @param id
     * @return
     */
    boolean delete(int id);

    /**
     * 模糊搜索新闻
     * @param key
     * @return
     */
    List<News> search(String key);

    /**
     * 获得所有新闻
     * 内容长度多于CONTENT_MAX_LENGTH时，
     * 截取CONTENT_MAX_LENGTH长度的内容
     * @return
     */
    List<News> getAll();

    /**
     * 更新新闻内容
      * @param news
     * @return
     */
    boolean update(News news);

    /**
     * ID查新闻
     * @param newsId
     * @return
     */
    News getById(int newsId);




}
