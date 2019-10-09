package com.Spring.DAO;

import com.Spring.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class StudentDAO {

    private static Map<Integer, Student> students;  //fake data for now

    static{
        students = new HashMap<Integer, Student>(){

            {
                put(1,new Student(1,"Said", "Computer Science"));
                put(2,new Student(1,"Alex", "Finance"));
                put(3,new Student(1,"Ana", "Maths"));
            }

        };
    }


    public static Collection<Student> getAllStudents(){

        return students.values();
    }

    public static Student getStudentById(int id){
        return students.get(id);
    }

    public static void removeStudentById(int id){
        students.remove(id);
    }

    public static void updateStudent(Student student){

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    public static void insertStudentToDb(Student student){
        students.put(student.getId(),student);
    }
}
