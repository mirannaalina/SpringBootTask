package com.Spring.Service;

import com.Spring.DAO.StudentDAO;
import com.Spring.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class StudentService {

    @Autowired
    @Qualifier("fakeData") //daca am mongodata, doar schimb qualifier-ul
    private StudentDAO studendao;

    public Collection<Student> getAllStudents(){

        return StudentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return StudentDAO.getStudentById(id);
    }

    public void removeStudentById(int id){
        StudentDAO.removeStudentById(id);
    }

    public void updateStudent(Student student){
        StudentDAO.updateStudent(student);
    }

    public void insertStudent(Student student){
        StudentDAO.insertStudentToDb(student);
    }
}
