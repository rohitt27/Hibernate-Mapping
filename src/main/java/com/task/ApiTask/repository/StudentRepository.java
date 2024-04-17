package com.task.ApiTask.repository;

import com.task.ApiTask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
List<Student> findAll();
}
