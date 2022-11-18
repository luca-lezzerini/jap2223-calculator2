package al.edu.universitetipolis.calculator2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/greetings")
    public void greetings(){
        System.out.println("Hello Polis!");
    }

    @GetMapping("/greetings2")
    public String greetings2(){
        return "<html><head></head><body>"
                + "<b>Hello</b> Polis!</body></html>";
    }
}
