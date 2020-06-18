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
package com.zeki.mybatis.mapper;

import com.zeki.mybatis.dto.UserInfoDTO;
import com.zeki.mybatis.entity.User;
import com.zeki.mybatis.entity.UserCustom;
import com.zeki.mybatis.entity.UserQueryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/5/11 23:51
 */
@Mapper
public interface UserMapper {

    /**
     * 用户信息综合查询
     *
     * @param userQueryVo
     * @return
     * @throws Exception
     */
    List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;


    List<UserInfoDTO> getUserInfo();


    /**
     * 用户信息综合查询总数
     *
     * @param userQueryVo
     * @return
     * @throws Exception
     */
    int findUserCount(UserQueryVo userQueryVo) throws Exception;


    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    User findUserById(int id) throws Exception;


    /**
     * 根据id查询用户信息，使用resultMap输出
     *
     * @param id
     * @return
     * @throws Exception
     */
    User findUserByIdResultMap(int id) throws Exception;


    /**
     * 根据用户名列查询用户列表
     *
     * @param name
     * @return
     * @throws Exception
     */
    List<User> findUserByName(String name) throws Exception;


    /**
     * 插入用户
     *
     * @param user
     * @throws Exception
     */
    void insertUser(User user) throws Exception;


    /**
     * 删除用户
     *
     * @param id
     * @throws Exception
     */
    void deleteUser(int id) throws Exception;

}
