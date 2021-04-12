package com.example.springwebfluxapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class StudentApi {

    private StudentRepo studentRepo;

    public StudentApi(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @GetMapping
    public Flux<String> getAll() {
        return Flux.just("Anna", "Andrzej", "Barbara", "Cezary", "Karol", "Karolina", "Krzysztof", "Wojciech", "Zbigniew", "Zuzanna");
    }
}
