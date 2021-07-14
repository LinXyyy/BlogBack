package cn.vespers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xyyy
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String account;
    private String password;
}
