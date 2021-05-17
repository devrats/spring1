/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/17/2021
 *   Time: 4:41 PM
 *   File: EmployeeDao.java
 */

package com.example.hibernatespring;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

public class EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDao)) return false;
        EmployeeDao that = (EmployeeDao) o;
        return Objects.equals(hibernateTemplate, that.hibernateTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hibernateTemplate);
    }

    public EmployeeDao() {
    }

    public EmployeeDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void insert(Employee employee){
        this.hibernateTemplate.save(employee);
    }
}