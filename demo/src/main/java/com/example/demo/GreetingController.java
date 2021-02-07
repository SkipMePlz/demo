package com.example.demo;

import com.example.demo.Greetings;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Greetings helloPage(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greetings(counter.incrementAndGet(),String.format(template,name));


    }

}
