package com.example.appadmin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

//  @GetMapping("/login")
//  public String loing() {
//    return "login/index";
//  }
//  @GetMapping("/login/daily")
//  public String loing2() {
//    return "login/daily/index";
//  }
  @GetMapping("/test")
  public String test() {
    return "test";
  }

  @GetMapping("/test/login")
  public String testLogin() {
    return "";
  }
}
