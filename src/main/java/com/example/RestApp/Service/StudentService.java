package com.example.RestApp.Service;

import com.example.RestApp.Dao.StudentDao;
import com.example.RestApp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
//the service that use the database
@Service
public class StudentService {
    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();

    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudentById(Student student) {
        this.studentDao.updateStudentById(student);

    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
