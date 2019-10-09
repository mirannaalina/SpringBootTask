package com.Spring.DAO;

import com.Spring.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDAO implements InterfStudentDao{
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(1, "Mario", "MAths"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
