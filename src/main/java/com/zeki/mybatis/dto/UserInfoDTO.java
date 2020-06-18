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

import java.util.List;

/**
 * Description:
 *
 * @author guchaolong
 * @date 2020/6/17 23:06
 */
public class UserInfoDTO {
    private Integer userId;
    private Integer deptId;
    private String name;

    private DeptDTO deptInfo;
    private List<RoleDTO> roleInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeptDTO getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(DeptDTO deptInfo) {
        this.deptInfo = deptInfo;
    }

    public List<RoleDTO> getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(List<RoleDTO> roleInfo) {
        this.roleInfo = roleInfo;
    }
}