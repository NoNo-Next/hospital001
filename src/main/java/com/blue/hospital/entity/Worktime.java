package com.blue.hospital.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * worktime
 * @值班表
 */
@Data
public class Worktime implements Serializable {
    /**
     * 主键
     */
    private Integer wkid;

    private String worktime;

    private Integer departmentid;

    private Integer userid;
    
    private User user; //外键对象
    
    private Department department; //外键对象

    private static final long serialVersionUID = 1L;

}