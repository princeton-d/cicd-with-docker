package com.princeton.cicdwithdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/v1")
    public String test() {
        return "test1 자동 cicd다 이자식아";
    }

}
