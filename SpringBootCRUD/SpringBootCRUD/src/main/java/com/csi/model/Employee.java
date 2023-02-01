package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee_ Datails")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "emp_Id")
    private int empId;
    @Column(name = "emp_Name")
    private String empName;
    @Column(name = "emp_Address")
    private String empAddress;
    @Column(name="emp_Sallary")
    private double empSallary;
    @Column(name = "emp_ContactNo")
    private long empContactNo;
    @Column(name = "emp_Dob")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDob;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public double getEmpSallary() {
        return empSallary;
    }

    public void setEmpSallary(double empSallary) {
        this.empSallary = empSallary;
    }

    public long getEmpContactNo() {
        return empContactNo;
    }

    public void setEmpContactNo(long empContactNo) {
        this.empContactNo = empContactNo;
    }

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }
}
