/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/11/2021
 *   Time: 8:06 PM
 *   File: JavaConfig.java
 */

package com.example.springjdbc.withxoutml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@ComponentScan(basePackages = "com.example.springjdbc.withxoutml")
public class JavaConfig {

    @Bean("dataSource")
    public DriverManagerDataSource getDriverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new
                DriverManagerDataSource("jdbc:mysql://localhost:3306/springjdbc","root","");
        return driverManagerDataSource;
    }

    @Bean("mapper")
    public StudentRowMapper getStudentRowMapper(){
        StudentRowMapper studentRowMapper = new StudentRowMapper();
        return studentRowMapper;
    }

    @Bean("template")
    public JdbcTemplate getJdbcTemplate(){
        DataSource dataSource;
        JdbcTemplate jdbcTemplate =
                new JdbcTemplate(getDriverManagerDataSource());
        return jdbcTemplate;
    }

    @Bean("studentDao")
    public StudentDao getStudentDao(){
        StudentDao studentDao = new StudentDao(getJdbcTemplate(),getStudentRowMapper());
        return studentDao;
    }
}