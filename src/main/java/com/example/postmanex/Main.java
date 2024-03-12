package com.example.postmanex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @GetMapping("/main")
    @ResponseBody
    public String main(@RequestParam("name") String name) {
        return "안녕하세요 "+ name+ " 님 !!";
    }
}
