package cn.vespers.service.impl;

import cn.vespers.dao.UserMapper;
import cn.vespers.pojo.User;
import cn.vespers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xyyy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(String account, String password) {
        User user = userMapper.selectUserByAccount(account);

        if (user == null || !user.getPassword().equals(password)) {
            return 1;
        }
        return 0;
    }

    @Override
    public Map<String, Object> updateUser(String account, String password) {
        int res = userMapper.updateUser(account, password);
        Map<String, Object> result = new HashMap<>();

        if (1 == res) {
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
