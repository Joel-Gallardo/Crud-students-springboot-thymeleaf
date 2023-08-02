package com.crud.web.service;

import com.crud.web.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student saveStudent(Student student);

    public Student findStudentById(Long id);

    public Student updateStudent(Student student);

    public void deleteStudent(Long id);

}
