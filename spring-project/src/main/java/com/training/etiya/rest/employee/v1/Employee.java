package com.training.etiya.rest.employee.v1;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.training.etiya.rest.employee.validation.StartWith;

@Entity
@Table(name = "calisan")
public class Employee {

    @Id
    @GeneratedValue
    private Long       empId;

    @NotEmpty
    @Size(min = 2, max = 20, message = "Name 2 ile 20 arasında olmalı")
    @Column(name = "isim", length = 20)
    private String     name;

    @NotEmpty
    @Size(min = 3, max = 25, message = "Surname 3 ile 25 arasında olmalı")
    @StartWith("soy")
    private String     surname;

    @Max(200)
    @Min(5)
    private Integer    weight;

    @NonNull
    @Past
    private LocalDate  birtDate;

    @Email
    private String     email;

    @OneToOne(fetch = FetchType.EAGER,
              cascade = {
                          CascadeType.ALL
              },
              mappedBy = "employee")
    private EmployeeEx emEx;


    @OneToMany(fetch = FetchType.EAGER,
               cascade = {
                           CascadeType.ALL
               },
               mappedBy = "employee")
    private List<Phone> phoneList;

    @Version
    private int         abd;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }


    public LocalDate getBirtDate() {
        return this.birtDate;
    }


    public void setBirtDate(final LocalDate birtDateParam) {
        this.birtDate = birtDateParam;
    }


    public String getEmail() {
        return this.email;
    }


    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }

    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(final Long empIdParam) {
        this.empId = empIdParam;
    }

    public EmployeeEx getEmEx() {
        return this.emEx;
    }

    public void setEmEx(final EmployeeEx emExParam) {
        this.emEx = emExParam;
    }

    public List<Phone> getPhoneList() {
        return this.phoneList;
    }

    public void setPhoneList(final List<Phone> phoneListParam) {
        this.phoneList = phoneListParam;
    }

    public int getAbd() {
        return this.abd;
    }

    public void setAbd(final int abdParam) {
        this.abd = abdParam;
    }


}
