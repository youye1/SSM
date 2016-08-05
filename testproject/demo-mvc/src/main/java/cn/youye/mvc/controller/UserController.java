package cn.youye.mvc.controller;

import cn.youye.mvc.entity.User;
import cn.youye.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2016/7/12.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(@RequestParam String name, @RequestParam String password, HttpServletRequest request) {

        try {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user = userService.get(user);
            if (user != null) {
                request.setAttribute("msg", "登陆成功");
                return "modules/sys/success";
            } else {
                request.setAttribute("msg", "登录失败");
                return "modules/sys/login";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "modules/sys/login";
    }

}
