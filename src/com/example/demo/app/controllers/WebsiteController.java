package com.example.demo.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

  @RequestMapping("demo/{name}/")
  public String demo(@PathVariable("name") String name) {
    return "demo";
  }

}
