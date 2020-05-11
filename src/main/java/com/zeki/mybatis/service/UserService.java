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
package com.zeki.mybatis.service;

import com.zeki.mybatis.entity.User;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/12 0:25
 */
public interface UserService {
    User findUserById(int id) throws Exception;
}
