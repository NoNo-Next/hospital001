package com.blue.hospital.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * supplier
 * 药品供应商类
 */
@Data
public class Supplier implements Serializable {
    /**
     * 供应商号
     */
    private Integer supplierid;

    /**
     * 供应商地名称
     */
    private String name;

    /**
     * 负责人
     */
    private String chargeperson;

    /**
     * 供应商地址
     */
    private String address;

    /**
     *电话号码
     */
    private String tel;

    /**
     * 信贷情况
     */
    private String creditsituation;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

}