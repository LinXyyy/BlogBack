package cn.vespers.service;

import java.util.Map;

/**
 * @author Xyyy
 */
public interface UserService {

    /**
     * 登录检查账号密码
     * @param account 账号
     * @param password 密码
     * @return 是否正确 0true 1false
     */
    int login(String account, String password);

    /**
     * 修改账号或密码
     * @param account 账号
     * @param password 密码
     * @return 结果
     */
    Map<String, Object> updateUser(String account, String password);
}
