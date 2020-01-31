package com.example.RestApp.Dao;
import com.example.RestApp.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//create the Database

@Repository
@Qualifier("fakeData")
public class StudentDaoImp implements StudentDao {
private static  Map<Integer, Student> students;
static {
    students=new HashMap<Integer, Student>(){
        {
            put(1, new Student(1,"meriem","computerScience"));
            put(2, new Student(2,"youssef","computerScience"));
            put(3, new Student(1,"dorra","doctor"));
        }
    };
}
@Override
public Collection<Student>getAllStudents(){
    return this.students.values();

}
@Override
public  Student getStudentById(int id){
    return this.students.get(id);
}

    @Override
    public void removeStudentById(int id) {
    this.students.remove(id);
    }

    @Override
    public void updateStudentById(Student student){
    Student s =students.get(student.getId());
    s.setCourse(student.getCourse());
    s.setName(student.getName());
    students.put(student.getId(),student);


    }

    @Override
    public void insertStudent(Student student) {
    this.students.put(student.getId(),student);
    }
}
