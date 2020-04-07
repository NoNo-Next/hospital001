package com.blue.hospital.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Register {

    /**
     *挂号id
     */
    private Integer registerid;

    /**
     *挂号病人
     */
    private Integer registerPatient;

    /**
     *挂号费用
     */
    private Double expenses;

    /**
     *挂号科室
     */
    private Integer registerDepartment;

    /**
     *挂号医生
     */
    private Integer registerDoctor;

    /**
     * 挂号日期
     */
    private Date registerDate;

    private User doctor;

    private Department department;

    private Patient patient;


}