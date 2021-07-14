package cn.vespers.controller;

import cn.vespers.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author x1yyy
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @RequestMapping("/articles")
    public Map<String, Object> articles() {
        return articleService.articles();
    }

    @ResponseBody
    @RequestMapping("/getArticleById")
    public Map<String, Object> getArticleById(String id) {
        return articleService.getArticleById(id);
    }

    @ResponseBody
    @RequestMapping("/classifications")
    public Map<String, Object> classifications() {
        return articleService.classifications();
    }

    @ResponseBody
    @RequestMapping("/getArticlesByClassification")
    public Map<String, Object> getArticlesByClassification(String classification) {
        return articleService.getArticlesByClassification(classification);
    }

    @ResponseBody
    @RequestMapping("/select")
    public Map<String, Object> select(String title) {
        return articleService.select(title);
    }

    @ResponseBody
    @RequestMapping("/add")
    public Map<String, Object> add(String title, String summary, String classify, String text) {
        return articleService.add(title, summary, classify, text);
    }

    @ResponseBody
    @RequestMapping("/login")
    public int login(String account, String password) {
        return "curtain".equals(account) && "wangkunxu!?#".equals(password) ? 0 : 1;
    }
}
