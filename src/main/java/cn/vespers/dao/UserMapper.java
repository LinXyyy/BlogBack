package cn.vespers.dao;

import cn.vespers.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Xyyy
 */
public interface UserMapper {

    /**
     * 通过account查询用户
     * @param account 账号
     * @return 用户
     */
    User selectUserByAccount(@Param("account") String account);

    /**
     * 修改账号或密码
     * @param account 账号
     * @param password 密码
     * @return 结果
     */
    int updateUser(@Param("account") String account, @Param("password") String password);
}
