package com.cybersoft.demospringboot.controller;

/*
* @Controller : Cho phép định nghĩa đường dẫn thường là trả file html (giao diện) (Monoweb)
* @ResponseBody : Chỉ trả ra string
*
* @RestController : @Controller + @ResponseBody -> Cho phép định nghĩa đường dẫn luôn luôn trả ra chuỗi (String) (Viết api)
* /demo
* /demo/hello
*
*
* /user
* /user/signin
* /user/singup
* */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("")
    public String demo(){
        return "Demo";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
