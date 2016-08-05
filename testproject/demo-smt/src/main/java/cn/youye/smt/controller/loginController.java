package cn.youye.smt.controller;

import cn.youye.smt.entity.User;
import cn.youye.smt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by pc on 2016/6/17.
 */
@Controller
public class loginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        User user = new User();
        user.setLoginName(request.getParameter("userName"));

        List<User> users = userService.findList(user);
        if (users != null) {
            return "modules/test/success";
        } else {
            return "modules/test/failed";
        }
    }

    @RequestMapping(value = "/register",method = {RequestMethod.POST,RequestMethod.GET})
    public String register(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "modules/sys/register";
    }

}
