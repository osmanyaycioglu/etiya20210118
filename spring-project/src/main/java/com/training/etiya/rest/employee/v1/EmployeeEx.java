package com.training.etiya.rest.employee.v1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmployeeEx {

    @Id
    @GeneratedValue
    private Long     eeId;
    private String   tcNo;
    @Enumerated(EnumType.STRING)
    private EGender  gender;

    @JsonIgnore
    @XmlTransient
    @OneToOne(fetch = FetchType.EAGER,
              cascade = {
                          CascadeType.ALL
              })
    @JoinColumn(name = "empId")
    private Employee employee;

    public String getTcNo() {
        return this.tcNo;
    }

    public void setTcNo(final String tcNoParam) {
        this.tcNo = tcNoParam;
    }

    public EGender getGender() {
        return this.gender;
    }

    public void setGender(final EGender genderParam) {
        this.gender = genderParam;
    }

    public Long getEeId() {
        return this.eeId;
    }

    public void setEeId(final Long eeIdParam) {
        this.eeId = eeIdParam;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(final Employee employeeParam) {
        this.employee = employeeParam;
    }


}
