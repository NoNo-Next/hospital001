package com.blue.hospital.controller.url;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class UrlController {
    @RequestMapping("background")
    public String getBackground(){
        return "background";
    }

    @RequestMapping("user")
    public String getUserPage(){
        return "user";
    }

    @RequestMapping("position")
    public String getPositionPage(){
        return "position";
    }

    @RequestMapping("department")
    public String getDepartmentPage(){
        return "department";
    }
    @RequestMapping("worktime")
    public String getWorktimePage(){
        return "worktime";
    }
    @RequestMapping("icu")
    public String getIcuPage(){
        return "icu";
    }
    @RequestMapping("register")
    public String getRegisterPage(){
        return "register";
    }
    @RequestMapping("medicalrecord")
    public String getMedicalrecordPage(){
        return "medicalrecord";
    }
    @RequestMapping("prescription")
    public String getPrescriptionPage(){
        return "prescription";
    }
    @RequestMapping("chargeitem")
    public String getChargeitemPage(){
        return "chargeitem";
    }
    @RequestMapping("check")
    public String getCheckPage(){
        return "check";
    }
    @RequestMapping("patient")
    public String getPatientPage(){
        return "patient";
    }

    @RequestMapping("inpatient")
    public String getInpatientPage(){
        return "inpatient";
    }
    @RequestMapping("bed")
    public String getBeddPage(){
        return "bed";
    }
    @RequestMapping("hospitalizationAdvice")
    public String getHospitalizationAdvicePage(){
        return "hospitalizationAdvice";
    }
    @RequestMapping("hospitalizationprescription")
    public String getHospitalizationprescriptionPage(){
        return "hospitalizationprescription";
    }
    @RequestMapping("hospitallzationfeeitems")
    public String getHospitallzationfeeitemsPage(){
        return "hospitallzationfeeitems";
    }
    @RequestMapping("hospitalizationcheck")
    public String getHospitalizationcheckPage(){
        return "hospitalizationcheck";
    }

    @RequestMapping("operation")
    public String getOperationPage(){
        return "operation";
    }

    @RequestMapping("drugs")
    public String getDrugsPage(){
        return "drugs";
    }

    @RequestMapping("order")
    public String getOrderPage(){
        return "order";
    }

    @RequestMapping("drugstorage")
    public String getDrugstoragePage(){
        return "drugstorage";
    }

    @RequestMapping("supplier")
    public String getSupplierPage(){
        return "supplier";
    }
    @RequestMapping("salary")
    public String getSalaryPage(){
        return "salary";
    }
    @RequestMapping("chargestatus")
    public String getchargestatusPage(){
        return "chargestatus";
    }
    @RequestMapping("attendanceRecord")
    public String getAttendanceRecordPage(){
        return "attendanceRecord";
    }

}
