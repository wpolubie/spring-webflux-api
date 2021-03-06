package com.example.springwebfluxapi;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Student {

    @Getter @Setter
    private String id;
    @Getter @Setter
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
