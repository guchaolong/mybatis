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
 * @date 2020/6/17 23:08
 */

public class DeptDTO {
    private Integer deptId;
    private String name;

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
}