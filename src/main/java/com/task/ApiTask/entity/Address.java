package com.task.ApiTask.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String address;
    private String state;
    private String city;
    private String country;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "student_Id")
//    private Student student;

}
