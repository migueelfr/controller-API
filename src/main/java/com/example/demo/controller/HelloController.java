package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/test")
    public String helloWorld(){
        return "Hello World!, use o endpoint /apresentação!";
    }
    
    @GetMapping("/apresentacao")
    public String apresentação() {
        return "Boas Vindas a aba Apredentação! Estou treinando minha oratoria e dicção, obrigado pelo apoio!.";
    }
}