package com.training.etiya.rest.employee.v1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long     phoneId;

    private String   name;
    private String   phoneNumber;

    @JsonIgnore
    @XmlTransient
    @ManyToOne(fetch = FetchType.EAGER,
               cascade = {
                           CascadeType.ALL
               })
    private Employee employee;

    public Long getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(final Long phoneIdParam) {
        this.phoneId = phoneIdParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumberParam) {
        this.phoneNumber = phoneNumberParam;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(final Employee employeeParam) {
        this.employee = employeeParam;
    }


}
