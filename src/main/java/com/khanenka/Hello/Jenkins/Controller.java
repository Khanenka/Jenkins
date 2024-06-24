package com.khanenka.Hello.Jenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "rest")
public class Controller {

  @GetMapping("/hello")
  public String jenkins(){
    return "Hello!!!";
  }
}
