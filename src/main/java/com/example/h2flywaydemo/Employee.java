package com.example.h2flywaydemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name = "Employee")
@Table
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    private String email;
    private Timestamp dateOfBirth;
}
