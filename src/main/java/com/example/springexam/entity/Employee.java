package com.example.springexam.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String wage;
}
