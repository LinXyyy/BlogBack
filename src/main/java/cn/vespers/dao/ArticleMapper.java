package cn.vespers.dao;

import cn.vespers.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author x1yyy
 */
public interface ArticleMapper {

    /**
     * 获取所有文章中除了文章内容的字段
     * @return 查询结果
     */
    List<Article> articles();

    /**
     * 根据传入的id值获取指定id的文章
     * @param id 文章的主键
     * @return 结果
     */
    Article getArticleById(@Param("id") String id);

    /**
     * 获取所有文章的分类
     * @return 结果
     */
    List<String> classifications();

    /**
     * 获取指定分类下的文章
     * @param classification 指定分类
     * @return 结果
     */
    List<Article> getArticlesByClassification(@Param("classification") String classification);

    /**
     * 根据输入的标题查询文章
     * @param title 标题
     * @return 文章
     */
    List<Article> select(@Param("title") String title);

    /**
     * 添加文章
     * @param params 参数集
     * @return 是否成功
     */
    int add(Map<String, String> params);

    /**
     * 删除文章
     * @param id 文章的主键
     * @return 删除结果
     */
    int delete(@Param("id") String id);
}

