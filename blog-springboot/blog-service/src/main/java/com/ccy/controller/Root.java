package com.ccy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenFr
 * @data 2022年03月09日 11:23
 */
@RestController
public class Root {
    @GetMapping("/")
    public String blog(){
        return "hello, this is ccy-blog";
    }
}
