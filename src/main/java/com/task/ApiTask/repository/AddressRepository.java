package com.task.ApiTask.repository;

import com.task.ApiTask.entity.Address;
import com.task.ApiTask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
