/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 5/11/2021
 *   Time: 5:41 PM
 *   File: StudentDao.java
 */

package com.example.springjdbc.withxml;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Objects;

public class StudentDao implements StudentDaoInterface {

    private final String INSERT_QUERY = "INSERT INTO Student(Name,Age,Course) VALUES(?,?,?)";
    private final String UPDATE_QUERY = "UPDATE Student set Name = ?, Course = ? WHERE Age = ?";
    private final String DELETE_QUERY = "DELETE FROM Student WHERE Age = ?";
    private final String SHOW_ONE_QUERY = "SELECT * FROM Student WHERE Age = ?";
    private final String SHOW_ALL = "SELECT * FROM Student";
    private JdbcTemplate jdbcTemplate;
    private StudentRowMapper rowMapper;

    public StudentDao() {

    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "INSERT_QUERY='" + INSERT_QUERY + '\'' +
                ", UPDATE_QUERY='" + UPDATE_QUERY + '\'' +
                ", DELETE_QUERY='" + DELETE_QUERY + '\'' +
                ", SHOW_ONE_QUERY='" + SHOW_ONE_QUERY + '\'' +
                ", SHOW_ALL='" + SHOW_ALL + '\'' +
                ", jdbcTemplate=" + jdbcTemplate +
                ", rowMapper=" + rowMapper +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDao)) return false;
        StudentDao that = (StudentDao) o;
        return Objects.equals(INSERT_QUERY, that.INSERT_QUERY) && Objects.equals(UPDATE_QUERY, that.UPDATE_QUERY) && Objects.equals(DELETE_QUERY, that.DELETE_QUERY) && Objects.equals(SHOW_ONE_QUERY, that.SHOW_ONE_QUERY) && Objects.equals(SHOW_ALL, that.SHOW_ALL) && Objects.equals(getJdbcTemplate(), that.getJdbcTemplate()) && Objects.equals(getRowMapper(), that.getRowMapper());
    }

    @Override
    public int hashCode() {
        return Objects.hash(INSERT_QUERY, UPDATE_QUERY, DELETE_QUERY, SHOW_ONE_QUERY, SHOW_ALL, getJdbcTemplate(), getRowMapper());
    }

    public StudentRowMapper getRowMapper() {
        return rowMapper;
    }

    public void setRowMapper(StudentRowMapper rowMapper) {
        this.rowMapper = rowMapper;
    }

    public StudentDao(JdbcTemplate jdbcTemplate, StudentRowMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    public int insert(Student student){
        int result = jdbcTemplate.update(INSERT_QUERY,student.getName(),student.getAge(),student.getCourse());
        return result;
    }

    @Override
    public int update(Student student) {
        int result = jdbcTemplate.update(UPDATE_QUERY,student.getName(),student.getCourse(),student.getAge());
        return result;
    }

    @Override
    public int delete(Student student) {
        int result = jdbcTemplate.update(DELETE_QUERY,student.getAge());
        return result;
    }

    @Override
    public Student showOne(Student student) {
        Student student1 = this.jdbcTemplate.queryForObject(SHOW_ONE_QUERY,this.rowMapper,student.getAge());
        return student1;
    }

    @Override
    public List<Student> showAll() {
        List<Student> students = this.jdbcTemplate.query(SHOW_ALL,this.rowMapper);
        return students;
    }

    public void show(){
        jdbcTemplate.execute(UPDATE_QUERY);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}