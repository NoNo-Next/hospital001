package com.blue.hospital.entity;

import lombok.Data;

@Data
public class Patient {

    /**
     * 病人ID
     */
    private Integer patientid;

    /**
     * 病人名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 婚姻
     */
    private String marrage;

    /**
     * 出生地
     */
    private String birthplace;

    /**
     * 民族
     */
    private String nation;

    /**
     * 病人身份证号
     */
    private String patientcard;

    /**
     * 住址
     */
    private String address;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 联系人名字
     */
    private String contactsname;

    /**
     * 联系人关系
     */
    private String contactsrelationship;

    /**
     * 联系人电话
     */
    private String contactsnum;

    /**
     * 删除状态
     */
    private Integer isdelete;

}