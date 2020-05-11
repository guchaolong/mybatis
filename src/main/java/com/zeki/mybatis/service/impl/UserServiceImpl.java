/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: mybatis
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/5/12 1.0          guchaolong          Creation File
 */
package com.zeki.mybatis.service.impl;

import com.zeki.mybatis.entity.User;
import com.zeki.mybatis.mapper.UserMapper;
import com.zeki.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/12 0:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id)  throws Exception {
        return userMapper.findUserById(id);
    }
}