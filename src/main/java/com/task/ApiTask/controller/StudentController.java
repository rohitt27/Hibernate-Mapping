package com.task.ApiTask.controller;

import com.task.ApiTask.entity.Student;

import com.task.ApiTask.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/details")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
     return studentService.saveStudent(student);
    }
    @GetMapping("/getStudent")
    public List<Student> getStudents(){
    return studentService.getAllStudent();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student)

    {
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }


}
