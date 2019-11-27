package com.prc_springboot.mst.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    @GetMapping("/kitty")
    public String sayHello(){
        return "Hello kitty";
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Hello bye bye";
    }

}


