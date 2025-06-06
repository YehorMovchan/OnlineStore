package com.khai.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String department;
    @Column
    private int salary;

    public Employee() {    }


}
