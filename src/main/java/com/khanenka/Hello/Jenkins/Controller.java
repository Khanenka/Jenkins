package com.khanenka.Hello.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping
  public String jenkins(){
    return "Hello!";
  }
}
