package com.xs.bootdemo.controller;

import com.xs.bootdemo.entity.User;
import com.xs.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/toView")
    public String toView(HttpServletRequest request){
        return "user";
    }

    /**
     * 添加用户
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/saveUser")
    @ResponseBody
    public String saveUser(User user, Model model){
        userService.insert(user);
        model.addAttribute("msg","用户保存成功");
        return "success";
    }

    /**
     * 删除用户
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/deleteUser")
    public String deleteUser(int id,Model model){
        userService.deleteById(id);
        model.addAttribute("msg","用户删除成功");
        System.out.println("删除了用户id为"+id+"的用户");
        return "success";
    }

    /**
     * 查询用户
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectUserById")
    public String selectUserById(int id, Model model){
        User user = userService.selectById(id);
        System.out.println(user);
        model.addAttribute("msg","用户查询成功");
        return "success";
    }

    @RequestMapping(value = "/selectUserByName")
    public String selectUserByName(String name, Model model){
        User user = userService.selectByName(name);
        System.out.println(user);
        model.addAttribute("msg","用户查询成功");
        return "success";
    }

    /**
     * 修改用户信息
     * @param name
     * @param address
     * @param model
     * @return
     */
    @RequestMapping(value = "/updateUser")
    public String updateUser(String name,String address,Model model){
        //User user=userService.update(name,address);
        userService.update(name,address);
        model.addAttribute("msg","用户修改成功");
        return "success";
    }
}
