package com.study.javaWeb.Servlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

    @RequestMapping(value = "/test")
    public String test() {
        return "testSibal";
    }
}
