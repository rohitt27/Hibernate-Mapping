package com.task.ApiTask.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

import java.util.Date;

@Getter
@Setter
@Data
@Entity
@Table(name = "student_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "RollNo")
    private Integer rollno;
    @Column(name = "Date")
    private Date date;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;


}
