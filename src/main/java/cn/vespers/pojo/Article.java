package cn.vespers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author x1yyy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private int id;
    private String title;
    private String summary;
    private Date date;
    private String classification;
    private String text;
}
