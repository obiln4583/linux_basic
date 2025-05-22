package com.dailycodebuffer.Springboot.tutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    /*
    validations like if departmentName is not added it should throw up
    this message*/
    @NotBlank(message="Please Add department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCity;
/*
Note: to remove th boiler plate code-lombok was introduced
 data annotation contains setters and getter but noargs will not contain this
  lombok
    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCity) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCity = departmentCity;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }*/
}
