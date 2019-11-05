package edu.hfut.hawk_eye.controller;

import edu.hfut.hawk_eye.bean.JsonResult;
import edu.hfut.hawk_eye.entity.News;
import edu.hfut.hawk_eye.service.NewsService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    /**
     * 添加新闻
     * @param news
     * @return
     */
    @ApiOperation(value="创建新闻", notes="根据 News 对象创建新闻")
    @ApiImplicitParam(name = "news", value = "新闻实体 News ", required = true, dataType = "News")
    @PostMapping("/")
    public ResponseEntity<JsonResult<News>> add (@RequestBody News news){
        if (newsService.add(news)) {
            return ResponseEntity.ok(new JsonResult<News>());
        } else {
            return ResponseEntity.ok(new JsonResult<News>("创建新闻失败"));
        }

    }

    /**
     * 根据id删除新闻
     * @param id
     * @return
     */
    @ApiOperation(value="删除新闻", notes="根据id来指定删除新闻")
    @ApiImplicitParam(name = "id", value = "新闻ID", required = true, dataType = "Long", paramType = "path")
    @DeleteMapping("/{id}")
    public ResponseEntity<JsonResult<News>> delete (@PathVariable(value = "id") Integer id){
        if (newsService.delete(id)) {
            return ResponseEntity.ok(new JsonResult<News>());
        } else {
            return ResponseEntity.ok(new JsonResult<News>("删除新闻失败"));
        }
    }

    /**
     * 搜索相关新闻
     * @return
     */
    @ApiOperation(value="搜索相关新闻", notes="搜索相关新闻")
    @ApiImplicitParam(name = "key", value = "新闻关键词 ", required = true, dataType = "String")
    @PostMapping("search")
    public ResponseEntity<JsonResult<List<News>>> search (@RequestBody String key){
        return ResponseEntity.ok(new JsonResult<>(newsService.search(key)));
    }

    /**
     * 获取新闻
     * @return
     */
    @ApiOperation(value="获取新闻", notes="获取新闻")
    @GetMapping("/")
    public ResponseEntity<JsonResult<List<News>>> get (){
        return ResponseEntity.ok(new JsonResult<>(newsService.getAll()));
    }


    /**
     * 根据id修改新闻
     * @param news
     * @return
     */
    @ApiOperation(value="更新新闻", notes="根据id来更新新闻信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "新闻 ID", required = true, dataType = "Long",paramType = "path"),
            @ApiImplicitParam(name = "news", value = "新闻实体 news", required = true, dataType = "News")
    })
    @PutMapping(value = "/{id}")
    public ResponseEntity<JsonResult<News>> update (@PathVariable("id") Integer id, @RequestBody News news){
        news.setUserId(id);
        if (newsService.update(news)) {
            return ResponseEntity.ok(new JsonResult<News>());
        } else {
            return ResponseEntity.ok(new JsonResult<News>("修改新闻失败"));
        }
    }








}
