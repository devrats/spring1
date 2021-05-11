package com.example.springjdbc;

import java.util.List;

public interface StudentDaoInterface {
    int insert(Student student);
    int update(Student student);
    int delete(Student student);
    Student showOne(Student student);
    List<Student> showAll();
}
