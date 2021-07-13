package com.liu.covid.entity;

import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 健康打卡(EmpHealth)表实体类
 *
 * @author tengjian
 * @since 2021-07-13 21:55:38
 */
@Data
@TableName(value = "emp_health",autoResultMap = true)
public class EmpHealth implements Serializable {
        
    /**
     * 主键id
     */    
    @TableId(type = IdType.AUTO)   
    private Integer id;
        
    /**
     * 姓名
     */   
    private String name;
        
    /**
     * 性别
     */   
    private Object sex;
        
    /**
     * 手机号码
     */   
    private Integer phonenum;
        
    /**
     * 体温
     */   
    private Double temperature;
        
    /**
     * 风险地区
     */   
    private String riskArea;
        
    /**
     * 备注
     */   
    private String memo;
        
    /**
     * 打卡时间
     */   
    private Date createTime;
        
    /**
     * 部门id
     */   
    private Integer departmentId;
        
    /**
     * 员工编号
     */   
    private String code;
}