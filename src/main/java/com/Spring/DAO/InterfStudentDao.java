package com.Spring.DAO;

import com.Spring.Entity.Student;

import java.util.Collection;

public interface InterfStudentDao {

    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);

}
