package com.liu.covid.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 部门(Department)表实体类
 *
 * @author tengjian
 * @since 2021-07-12 15:54:22
 */
@Data
@TableName(value = "department",autoResultMap = true)
public class Department implements Serializable {
        
    /**
     * 业务主键
     */    
    @TableId(type = IdType.AUTO)   
    private Integer id;
        
    /**
     * 部门编号
     */
    @NotEmpty(message = "部门编号不能为空！")
    private String code;
        
    /**
     * 部门名称
     */
    @NotEmpty(message = "部门名称不能为空！")
    private String name;
        
    /**
     * 备注
     */   
    private String memo;
}