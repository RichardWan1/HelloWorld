package com.cmschina.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*********************************************
 * Author: wanrq
 * Created on: 2021-01-13-17:54
 ********************************************/
@RestController
public class TestController {
    @GetMapping("/get")
    public String get() {
        return "Hello World!";
    }
}
