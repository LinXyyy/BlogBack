package cn.vespers.service;

import java.util.Map;

/**
 * @author x1yyy
 */
public interface ArticleService {

    /**
     * 获取所有文章中除了文章内容的字段
     * @return 查询结果
     */
    Map<String, Object> articles();

    /**
     * 根据传入的id值获取指定id的文章
     * @param id 文章的主键
     * @return 结果
     */
    Map<String, Object> getArticleById(String id);

    /**
     * 获取所有文章的分类
     * @return 结果
     */
    Map<String, Object> classifications();

    /**
     * 获取指定分类下的文章
     * @param classification 指定分类
     * @return 结果
     */
    Map<String, Object> getArticlesByClassification(String classification);

    /**
     * 根据输入的标题查询文章
     * @param title 标题
     * @return 文章
     */
    Map<String, Object> select(String title);

    /**
     * 添加文章
     * @param title 文章标题
     * @param summary 文章简介
     * @param classify 文章分类
     * @param text 文章内容
     * @return 是否成功
     */
    Map<String, Object> add(String title, String summary, String classify, String text);
}
