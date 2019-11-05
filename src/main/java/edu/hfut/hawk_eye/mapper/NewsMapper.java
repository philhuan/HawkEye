package edu.hfut.hawk_eye.mapper;

import edu.hfut.hawk_eye.entity.News;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author yxs
 */
@Repository
public interface NewsMapper {

    /**
     * 添加新闻
     * @param news
     * @return 返回成功影响行数量（1）
     */
    int addNews(News news);

    /**
     * 根据标题模糊查询新闻
     * @param key
     * @return 新闻链表
     */
    List<News> selectNewsByKey(String key);

    /**
     *删除新闻
     * @param id
     * @return 返回成功影响行数量（1）
     */
    int deleteNews(int id);

    /**
     * 修改新闻
     * @param news
     * @return 返回成功影响行数量
     */
    int updateNews(News news);

    /**
     * 查询所有新闻
     * @return  所有新闻组成的链表
     */
    List<News> selectALLNews();

}

