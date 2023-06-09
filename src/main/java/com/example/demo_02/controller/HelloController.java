package com.example.demo_02.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: Hobbit
 * @date: 2023.06.08
 */
@Slf4j
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        log.info("哈哈哈！");
        return "hello!";
    }
}
