/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: mybatis
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/5/11 1.0          guchaolong          Creation File
 */
package com.zeki.mybatis.controller;

import com.zeki.mybatis.dto.UserInfoDTO;
import com.zeki.mybatis.entity.User;
import com.zeki.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/11 23:50
 */
@RestController
public class UserController {

    DispatcherServlet dispatcherServlet = new DispatcherServlet();
    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/findUserById/{id}")
    @ResponseBody
    public User findUserById(@PathVariable(value = "id") int id) throws Exception {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfoDTO> getUserInfo() throws Exception {
        return userService.getUserInfo();
    }
}