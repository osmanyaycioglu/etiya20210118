package com.training.etiya.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.training.etiya.rest.employee.v1.Employee;

@Repository
public class EmployeeCustomDao {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    private IEmployeeDao         empDao;

    @Transactional
    public void add(final Employee employeeParam) {
        EntityManager emLoc = this.entityManagerFactory.createEntityManager();
        emLoc.joinTransaction();
        emLoc.persist(employeeParam);

        //        try {
        //            emLoc.getTransaction()
        //                 .begin();
        //
        //            emLoc.persist(employeeParam);
        //
        //            emLoc.getTransaction()
        //                 .commit();
        //        } catch (Exception eLoc) {
        //            emLoc.getTransaction()
        //                 .rollback();
        //        }
    }

    @Transactional(propagation = Propagation.MANDATORY, isolation = Isolation.READ_UNCOMMITTED)
    public void add2(final Employee employeeParam) {
        this.empDao.save(employeeParam);
    }


}
