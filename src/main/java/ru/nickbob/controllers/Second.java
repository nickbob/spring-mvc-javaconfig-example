package ru.nickbob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Second {

    @GetMapping("/exit")
    public String Exit() {
        return "second/exit";
    }
}