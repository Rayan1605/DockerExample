package com.example.dockerexample3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/Get")
    public String Hello(){
        return "Hello World";
    }
}
