/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: mybatis
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2020/6/17 1.0          guchaolong          Creation File
 */
package com.zeki.mybatis.dto;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/17 23:10
 */
public class RoleDTO {
    private Integer roleId;
    private String name;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}