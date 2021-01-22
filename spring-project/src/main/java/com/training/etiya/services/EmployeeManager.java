package com.training.etiya.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.etiya.dao.IEmployeeDao;
import com.training.etiya.rest.employee.v1.Employee;
import com.training.etiya.rest.employee.v1.Phone;

@Service
public class EmployeeManager {

    @Autowired
    private IEmployeeDao employeeDao;

    public String add(final Employee emp) {
        emp.getEmEx()
           .setEmployee(emp);

        List<Phone> phoneListLoc = emp.getPhoneList();
        if (phoneListLoc != null) {
            for (Phone phoneLoc : phoneListLoc) {
                phoneLoc.setEmployee(emp);
            }
        }
        this.employeeDao.save(emp);
        return "OK";
    }

    public void remove(final Long empIdParam) {
        this.employeeDao.deleteById(empIdParam);
    }

    public void update(final Employee empParam) {
        this.employeeDao.save(empParam);
    }

    public Employee get(@NotNull final Long empIdParam) {
        return this.employeeDao.findById(empIdParam)
                               .orElse(null);
    }

    public List<Employee> getAll() {
        List<Employee> list = new ArrayList<>();
        this.employeeDao.findAll()
                        .forEach(e -> list.add(e));
        return list;
    }

    public List<Employee> getByName(final String nameParam) {
        return null;
    }

}
