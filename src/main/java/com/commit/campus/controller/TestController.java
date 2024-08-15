package com.commit.campus.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class TestController {
    @PostMapping("test")
    public void Test() {
        log.info("성공");
    }
}
