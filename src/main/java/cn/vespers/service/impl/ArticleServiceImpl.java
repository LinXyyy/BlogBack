package cn.vespers.service.impl;

import cn.vespers.dao.ArticleMapper;
import cn.vespers.pojo.Article;
import cn.vespers.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author x1yyy
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Map<String, Object> articles() {
        List<Article> articles = articleMapper.articles();

        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("message", "success");
        result.put("data", articles);

        return result;
    }

    @Override
    public Map<String, Object> getArticleById(String id) {
        Article article = articleMapper.getArticleById(id);

        Map<String, Object> result = new HashMap<>();

        if (article == null) {
            result.put("code", 1);
            result.put("message", "this id is null");
            result.put("data", null);
        } else {
            result.put("code", 0);
            result.put("message", "success");
            result.put("data", article);
        }

        return result;
    }

    @Override
    public Map<String, Object> classifications() {
        List<String> classifications = articleMapper.classifications();

        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("message", "success");
        result.put("data", classifications);

        return result;
    }

    @Override
    public Map<String, Object> getArticlesByClassification(String classification) {
        List<Article> articles = articleMapper.getArticlesByClassification(classification);

        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("message", "success");
        result.put("data", articles);

        return result;
    }

    @Override
    public Map<String, Object> select(String title) {
        title = "%" + title + "%";
        List<Article> articles = articleMapper.select(title);

        Map<String, Object> result = new HashMap<>();

        if (articles.size() == 0) {
            result.put("code", 1);
            result.put("message", "this title is null");
            result.put("data", null);
        } else {
            result.put("code", 0);
            result.put("message", "success");
            result.put("data", articles);
        }

        return result;
    }

    @Override
    public Map<String, Object> add(String title, String summary, String classify, String text) {
        Map<String, String> params = new HashMap<>();
        params.put("title", title);
        params.put("summary", summary);
        params.put("classification", classify);
        params.put("text", text);

        Map<String, Object> result = new HashMap<>();
        result.put("code", articleMapper.add(params) - 1);
        result.put("message", "success");

        return result;
    }

    @Override
    public Map<String, Object> delete(String id) {
        Map<String, Object> result = new HashMap<>();

        if (1 == articleMapper.delete(id)) {
            result.put("code", 0);
            result.put("message", "success");
            result.put("data", null);
        } else {
            result.put("code", 1);
            result.put("message", "failed");
            result.put("data", null);
        }

        return result;
    }
}
