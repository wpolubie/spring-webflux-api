package com.example.springwebfluxapi;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class StudentApi {

    private StudentRepo studentRepo;

    public StudentApi(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Student> getAll() {
      return studentRepo.findAll();
    }
}
