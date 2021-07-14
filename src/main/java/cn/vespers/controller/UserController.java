package cn.vespers.controller;

import cn.vespers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Xyyy
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public int login(String account, String password) {
        return userService.login(account, password);
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public Map<String, Object> updateUser(String account, String password) {
        return userService.updateUser(account,password);
    }
}
