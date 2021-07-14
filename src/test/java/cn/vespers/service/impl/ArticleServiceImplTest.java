package cn.vespers.service.impl;

import cn.vespers.service.ArticleService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class ArticleServiceImplTest extends TestCase {

    public void testArticles() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        articleService.articles();
    }

    public void testGetArticleById() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        Map<String, Object> article = articleService.getArticleById("asda");
        System.out.println(article.get("data"));
    }

    public void testClassifications() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        articleService.classifications();
    }

    public void testGetArticlesByClassification() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        articleService.getArticlesByClassification("Jxava");
    }

    public void testSelect() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        articleService.select("配");
    }

    public void testDelete() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = applicationContext.getBean("articleServiceImpl", ArticleService.class);

        articleService.delete("2");
    }
}