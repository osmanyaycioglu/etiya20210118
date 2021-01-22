package com.training.etiya.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.etiya.rest.employee.v1.Employee;


public interface IEmployeeDao extends CrudRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndSurname(String name,
                                        String surname);

    List<Employee> findByNameIn(List<String> name);

    List<Employee> findByNameInOrderByNameAsc(List<String> name);


    @Query("select e from Employee e where e.name = :isim")
    List<Employee> searchName(@Param("isim") String name);

    @Query(value = "select * from calisan where isim = :isim", nativeQuery = true)
    List<Employee> searchNameNative(@Param("isim") String name);

}
