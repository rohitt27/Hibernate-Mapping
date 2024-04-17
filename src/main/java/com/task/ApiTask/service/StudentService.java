package com.task.ApiTask.service;

import com.task.ApiTask.entity.Student;



import java.util.List;

public interface StudentService {
 Student saveStudent(Student student);
 List<Student> getAllStudent();
 Student updateStudent(Student student);
 void deleteStudent(Long id);



}
