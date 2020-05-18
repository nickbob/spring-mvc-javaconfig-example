package ru.nickbob;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping("/hello")
    public String helloPage(){
        return "hello";
    }
}