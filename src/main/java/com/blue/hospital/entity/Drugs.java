package com.blue.hospital.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * drugs
 * @author 
 */
@Data
public class Drugs implements Serializable {

    /**
     * 药品编号
     */
    private Integer drugsid;
    /**
     * 药品名称
     */
    private String drugsname;

    /**
     * 药品类型
     */
    private String drugstype;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 单位
     */
    private String amount;

    /**
     * 单价
     */
    private Double price;

    /**
     * 生产日期
     */
    private String manufacturedate;

    /**
     * 保质期
     */
    private String guaranteetime;


    private Integer supplierid;

	private Supplier  Supplier;

    private static final long serialVersionUID = 1L;

}